/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.service.impl;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shenyu.admin.config.properties.JwtProperties;
import org.apache.shenyu.admin.config.properties.LdapProperties;
import org.apache.shenyu.admin.config.properties.SecretProperties;
import org.apache.shenyu.admin.mapper.DashboardUserMapper;
import org.apache.shenyu.admin.mapper.DataPermissionMapper;
import org.apache.shenyu.admin.mapper.RoleMapper;
import org.apache.shenyu.admin.mapper.UserRoleMapper;
import org.apache.shenyu.admin.model.dto.DashboardUserDTO;
import org.apache.shenyu.admin.model.dto.UserRoleDTO;
import org.apache.shenyu.admin.model.entity.DashboardUserDO;
import org.apache.shenyu.admin.model.entity.RoleDO;
import org.apache.shenyu.admin.model.entity.UserRoleDO;
import org.apache.shenyu.admin.model.page.CommonPager;
import org.apache.shenyu.admin.model.page.PageResultUtils;
import org.apache.shenyu.admin.model.query.DashboardUserQuery;
import org.apache.shenyu.admin.model.vo.DashboardUserEditVO;
import org.apache.shenyu.admin.model.vo.DashboardUserVO;
import org.apache.shenyu.admin.model.vo.LoginDashboardUserVO;
import org.apache.shenyu.admin.model.vo.RoleVO;
import org.apache.shenyu.admin.service.DashboardUserService;
import org.apache.shenyu.admin.transfer.DashboardUserTransfer;
import org.apache.shenyu.admin.utils.JwtUtils;
import org.apache.shenyu.common.utils.ShaUtils;
import org.apache.shenyu.common.constant.AdminConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ldap.NameNotFoundException;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.support.LdapEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Implementation of the {@link org.apache.shenyu.admin.service.DashboardUserService}.
 */
@Service
public class DashboardUserServiceImpl implements DashboardUserService {

    private static final Logger LOG = LoggerFactory.getLogger(DashboardUserServiceImpl.class);

    private final SecretProperties secretProperties;

    private final DashboardUserMapper dashboardUserMapper;

    private final UserRoleMapper userRoleMapper;

    private final RoleMapper roleMapper;

    private final DataPermissionMapper dataPermissionMapper;

    @Nullable
    private final LdapProperties ldapProperties;

    @Nullable
    private final LdapTemplate ldapTemplate;

    private final JwtProperties jwtProperties;

    public DashboardUserServiceImpl(final SecretProperties secretProperties,
                                    final DashboardUserMapper dashboardUserMapper,
                                    final UserRoleMapper userRoleMapper,
                                    final RoleMapper roleMapper,
                                    final DataPermissionMapper dataPermissionMapper,
                                    @Nullable final LdapProperties ldapProperties,
                                    @Nullable final LdapTemplate ldapTemplate,
                                    final JwtProperties jwtProperties) {
        this.secretProperties = secretProperties;
        this.dashboardUserMapper = dashboardUserMapper;
        this.userRoleMapper = userRoleMapper;
        this.roleMapper = roleMapper;
        this.dataPermissionMapper = dataPermissionMapper;
        this.ldapProperties = ldapProperties;
        this.ldapTemplate = ldapTemplate;
        this.jwtProperties = jwtProperties;
    }

    /**
     * create or update dashboard user.
     *
     * @param dashboardUserDTO {@linkplain DashboardUserDTO}
     * @return rows
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createOrUpdate(final DashboardUserDTO dashboardUserDTO) {
        DashboardUserDO dashboardUserDO = DashboardUserDO.buildDashboardUserDO(dashboardUserDTO);
        // create new user
        if (StringUtils.isEmpty(dashboardUserDTO.getId())) {
            bindUserRole(dashboardUserDO.getId(), dashboardUserDTO.getRoles());
            return dashboardUserMapper.insertSelective(dashboardUserDO);
        }

        // update old user
        if (CollectionUtils.isNotEmpty(dashboardUserDTO.getRoles())) {
            if (!AdminConstants.ADMIN_NAME.equals(dashboardUserDTO.getUserName())) {
                userRoleMapper.deleteByUserId(dashboardUserDTO.getId());
            }
            bindUserRole(dashboardUserDTO.getId(), dashboardUserDTO.getRoles());
        }

        return dashboardUserMapper.updateSelective(dashboardUserDO);
    }

    /**
     * delete dashboard users.
     *
     * @param ids primary key of dashboard_user.
     * @return the count of deleted dashboard users
     */
    @Override
    public int delete(final List<String> ids) {
        int ret = 0;
        if (CollectionUtils.isNotEmpty(ids)) {
            Set<String> idSet = Optional.of(ids).orElseGet(ArrayList::new).stream()
                    .filter(StringUtils::isNotEmpty).collect(Collectors.toSet());
            DashboardUserDO dashboardUserDO = dashboardUserMapper.selectByUserName(AdminConstants.ADMIN_NAME);
            if (Objects.nonNull(dashboardUserDO)) {
                idSet.remove(dashboardUserDO.getId());
            }
            if (CollectionUtils.isNotEmpty(ids)) {
                ret = dashboardUserMapper.deleteByIdSet(idSet);
                userRoleMapper.deleteByUserIdSet(idSet);
                dataPermissionMapper.deleteByUserIdSet(idSet);
            }
        }

        return ret;
    }

    /**
     * find dashboard user by id.
     *
     * @param id primary key..
     * @return {@linkplain DashboardUserVO}
     */
    @Override
    public DashboardUserEditVO findById(final String id) {

        DashboardUserVO dashboardUserVO = DashboardUserVO.buildDashboardUserVO(dashboardUserMapper.selectById(id));

        Set<String> roleIdSet = Optional.ofNullable(userRoleMapper.findByUserId(id))
                .orElseGet(ArrayList::new)
                .stream()
                .map(UserRoleDO::getRoleId)
                .collect(Collectors.toSet());

        List<RoleDO> allRoleDOList = Optional.ofNullable(roleMapper.selectAll())
                .orElseGet(ArrayList::new);
        List<RoleVO> allRoles = allRoleDOList.stream()
                .map(RoleVO::buildRoleVO).collect(Collectors.toList());

        List<RoleDO> roleDOList = allRoleDOList.stream()
                .filter(roleDO -> roleIdSet.contains(roleDO.getId()))
                .collect(Collectors.toList());
        List<RoleVO> roles = Optional.of(roleDOList)
                .orElseGet(ArrayList::new).stream()
                .map(RoleVO::buildRoleVO)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        return DashboardUserEditVO.buildDashboardUserEditVO(dashboardUserVO, roles, allRoles);
    }

    /**
     * find dashboard user by query.
     *
     * @param userName user name
     * @param password user password
     * @return {@linkplain DashboardUserVO}
     */
    @Override
    public DashboardUserVO findByQuery(final String userName, final String password) {
        return DashboardUserVO.buildDashboardUserVO(dashboardUserMapper.findByQuery(userName, password));
    }

    /**
     * find dashboard user by username.
     *
     * @param userName user name
     * @return {@linkplain DashboardUserVO}
     */
    @Override
    public DashboardUserVO findByUserName(final String userName) {
        return DashboardUserVO.buildDashboardUserVO(dashboardUserMapper.selectByUserName(userName));
    }

    /**
     * find page of dashboard user by query.
     *
     * @param dashboardUserQuery {@linkplain DashboardUserQuery}
     * @return {@linkplain CommonPager}
     */
    @Override
    public CommonPager<DashboardUserVO> listByPage(final DashboardUserQuery dashboardUserQuery) {
        return PageResultUtils.result(dashboardUserQuery.getPageParameter(),
            () -> dashboardUserMapper.countByQuery(dashboardUserQuery),
            () -> dashboardUserMapper.selectByQuery(dashboardUserQuery)
                        .stream()
                        .map(DashboardUserVO::buildDashboardUserVO)
                        .collect(Collectors.toList()));
    }

    /**
     * To deal with the admin login.
     *
     * @param userName default username is admin
     * @param password admin password
     * @return {@linkplain LoginDashboardUserVO}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public LoginDashboardUserVO login(final String userName, final String password) {
        DashboardUserVO dashboardUserVO = null;
        if (Objects.nonNull(ldapTemplate)) {
            dashboardUserVO = loginByLdap(userName, password);
        }

        if (Objects.isNull(dashboardUserVO)) {
            dashboardUserVO = loginByDatabase(userName, password);
        }

        final LoginDashboardUserVO loginDashboardUserVO = LoginDashboardUserVO.buildLoginDashboardUserVO(dashboardUserVO);
        final DashboardUserVO finalDashboardUserVO = dashboardUserVO;
        return Optional.ofNullable(loginDashboardUserVO).map(loginUser -> {
            if (Boolean.FALSE.equals(loginUser.getEnabled())) {
                return loginUser;
            }
            return loginUser.setToken(JwtUtils.generateToken(finalDashboardUserVO.getUserName(), finalDashboardUserVO.getPassword(),
                    jwtProperties.getExpiredSeconds()));
        }).orElse(null);
    }

    private DashboardUserVO loginByLdap(final String userName, final String password) {
        String searchBase = String.format("%s=%s,%s", ldapProperties.getLoginField(), LdapEncoder.nameEncode(userName), ldapProperties.getBaseDn());
        String filter = String.format("(objectClass=%s)", ldapProperties.getObjectClass());
        try {
            DashboardUserVO dashboardUserVO = null;
            if (ldapTemplate.authenticate(searchBase, filter, password)) {
                dashboardUserVO = findByUserName(userName);
                if (Objects.isNull(dashboardUserVO)) {
                    RoleDO role = roleMapper.findByRoleName("default");
                    DashboardUserDTO dashboardUserDTO = DashboardUserDTO.builder()
                            .userName(userName)
                            .password(ShaUtils.shaEncryption(password))
                            .role(1)
                            .roles(Lists.newArrayList(role.getId()))
                            .enabled(true)
                            .build();
                    createOrUpdate(dashboardUserDTO);
                    dashboardUserVO = DashboardUserTransfer.INSTANCE.transferDTO2VO(dashboardUserDTO);
                }
            }
            return dashboardUserVO;
        } catch (NameNotFoundException e) {
            return null;
        } catch (Exception e) {
            LOG.error("ldap verify error.", e);
            return null;
        }
    }

    private DashboardUserVO loginByDatabase(final String userName, final String password) {
        return findByQuery(userName, ShaUtils.shaEncryption(password));
    }

    /**
     * bind user and role id.
     *
     * @param userId user id
     * @param roleIds role ids.
     */
    private void bindUserRole(final String userId, final List<String> roleIds) {
        List<UserRoleDO> userRoleDOList = Optional.ofNullable(roleIds).orElseGet(ArrayList::new)
                        .stream().map(roleId -> UserRoleDO.buildUserRoleDO(UserRoleDTO.builder().userId(userId).roleId(roleId).build()))
                        .collect(Collectors.toList());
        if (CollectionUtils.isEmpty(userRoleDOList)) {
            return;
        }
        userRoleMapper.insertBatch(userRoleDOList);
    }
}
