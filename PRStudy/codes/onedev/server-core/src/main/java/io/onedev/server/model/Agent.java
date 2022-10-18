package io.onedev.server.model;

import static io.onedev.server.model.Agent.PROP_CPU;
import static io.onedev.server.model.Agent.PROP_IP_ADDRESS;
import static io.onedev.server.model.Agent.PROP_LAST_USED_DATE;
import static io.onedev.server.model.Agent.PROP_MEMORY;
import static io.onedev.server.model.Agent.PROP_NAME;
import static io.onedev.server.model.Agent.PROP_OS_ARCH;
import static io.onedev.server.model.Agent.PROP_OS_NAME;
import static io.onedev.server.model.Agent.PROP_OS_VERSION;
import static io.onedev.server.model.Agent.PROP_PAUSED;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import io.onedev.agent.AgentData;
import io.onedev.k8shelper.OsInfo;
import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.AgentManager;
import io.onedev.server.job.resource.ResourceHolder;
import io.onedev.server.util.CollectionUtils;

@Entity
@Table(indexes={
		@Index(columnList="o_token_id"), @Index(columnList=PROP_IP_ADDRESS),
		@Index(columnList=PROP_PAUSED), @Index(columnList=PROP_NAME), 
		@Index(columnList=PROP_OS_NAME), @Index(columnList=PROP_OS_VERSION), 
		@Index(columnList=PROP_CPU), @Index(columnList=PROP_MEMORY), 
		@Index(columnList=PROP_OS_ARCH), @Index(columnList=PROP_LAST_USED_DATE)}) 
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Agent extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;

	public static final String NAME_NAME = "Name";
	
	public static final String PROP_NAME = "name";
	
	public static final String PROP_PAUSED = "paused";
	
	public static final String PROP_BUILDS = "builds";
	
	public static final String PROP_ATTRIBUTES = "attributes";
	
	public static final String NAME_IP_ADDRESS = "Ip Address";
	
	public static final String PROP_IP_ADDRESS = "ipAddress";
	
	public static final String NAME_OS_NAME = "Os";
	
	public static final String PROP_OS_NAME = "osName";
	
	public static final String NAME_OS_VERSION = "Os Version";
	
	public static final String PROP_OS_VERSION = "osVersion";
	
	public static final String NAME_OS_ARCH = "Os Arch";
	
	public static final String PROP_OS_ARCH = "osArch";
	
	public static final String NAME_CPU = "CPU";
	
	public static final String PROP_CPU = "cpu";

	public static final String NAME_MEMORY = "Memory";
	
	public static final String PROP_MEMORY = "memory";

	public static final String PROP_LAST_USED_DATE = "lastUsedDate";
	
	public static final Set<String> ALL_FIELDS = Sets.newHashSet(
			NAME_NAME, NAME_IP_ADDRESS, NAME_OS_NAME, NAME_OS_VERSION, NAME_OS_ARCH, NAME_CPU, NAME_MEMORY);
	
	public static final List<String> QUERY_FIELDS = Lists.newArrayList(
			NAME_NAME, NAME_IP_ADDRESS, NAME_OS_NAME, NAME_OS_VERSION, NAME_OS_ARCH, NAME_CPU, NAME_MEMORY);

	public static final Map<String, String> ORDER_FIELDS = CollectionUtils.newLinkedHashMap(
			NAME_NAME, PROP_NAME,
			NAME_IP_ADDRESS, PROP_IP_ADDRESS,
			NAME_OS_NAME, PROP_OS_NAME,
			NAME_OS_VERSION, PROP_OS_VERSION,
			NAME_OS_ARCH, PROP_OS_ARCH, 
			NAME_CPU, PROP_CPU, 
			NAME_MEMORY, PROP_MEMORY);	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=false)
	private AgentToken token;
	
	@OneToMany(mappedBy="agent", cascade=CascadeType.REMOVE)
	private Collection<AgentAttribute> attributes = new ArrayList<>();
	
	@OneToMany(mappedBy="agent")
	private Collection<Build> builds = new ArrayList<>();
	
	@Column(nullable=false, unique=true)
	private String name;
	
	@Column(nullable=false)
	private String ipAddress;
	
	@Column(nullable=false)
	private String osName;
	
	@Column(nullable=false)
	private String osVersion;
	
	@Column(nullable=false)
	private String osArch;
	
	private int cpu;
	
	private int memory;
	
	private boolean temporal;
	
	private boolean paused;
	
	private Date lastUsedDate;
	
	private transient Boolean online;

	public AgentToken getToken() {
		return token;
	}

	public void setToken(AgentToken token) {
		this.token = token;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getOsArch() {
		return osArch;
	}

	public void setOsArch(String osArch) {
		this.osArch = osArch;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isTemporal() {
		return temporal;
	}

	public void setTemporal(boolean temporal) {
		this.temporal = temporal;
	}

	public Collection<AgentAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(Collection<AgentAttribute> attributes) {
		this.attributes = attributes;
	}

	public Date getLastUsedDate() {
		return lastUsedDate;
	}

	public void setLastUsedDate(Date lastUsedDate) {
		this.lastUsedDate = lastUsedDate;
	}

	public Map<String, String> getAttributeMap() {
		Map<String, String> attributeMap = new HashMap<>();
		for (AgentAttribute attribute: getAttributes())
			attributeMap.put(attribute.getName(), attribute.getValue());
		return attributeMap;
	}
	
	public boolean isOnline() {
		if (online == null)
			online = OneDev.getInstance(AgentManager.class).getOnlineAgentIds().contains(getId());
		return online;
	}
	
	public Map<String, Integer> getResources() {
		Map<String, Integer> resources = new HashMap<>();
		resources.put(ResourceHolder.CPU, cpu);
		resources.put(ResourceHolder.MEMORY, memory);
		return resources;
	}
	
	public AgentData getAgentData() {
		return new AgentData(getToken().getValue(), new OsInfo(osName, osVersion, osArch),  
				name, ipAddress, cpu, memory, temporal, getAttributeMap());
	}
	
}
