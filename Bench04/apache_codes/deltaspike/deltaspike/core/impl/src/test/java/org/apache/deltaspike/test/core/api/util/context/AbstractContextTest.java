/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.deltaspike.test.core.api.util.context;

import javax.enterprise.inject.spi.Extension;

import org.apache.deltaspike.core.api.provider.BeanProvider;
import org.apache.deltaspike.test.category.SeCategory;
import org.apache.deltaspike.test.util.ArchiveUtils;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.Assert;

/**
 * We test the AbstractContext by implementing a simple dummy context.
 */
@RunWith(Arquillian.class)
@Category(SeCategory.class)
public class AbstractContextTest
{
    /**
     * X TODO creating a WebArchive is only a workaround because JavaArchive
     * cannot contain other archives.
     */
    @Deployment
    public static WebArchive deploy()
    {
        JavaArchive testJar = ShrinkWrap
                .create(JavaArchive.class, "abstractContextTest.jar")
                .addClass(AbstractContextTest.class)
                .addClass(DummyBean.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsServiceProvider(Extension.class, DummyScopeExtension.class);

        return ShrinkWrap
                .create(WebArchive.class, "abstractContextTest.war")
                .addAsLibraries(ArchiveUtils.getDeltaSpikeCoreArchive())
                .addAsLibraries(testJar)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }


    // This test is a hack yet due to a bug in the owb-arquillian and weld-arquillian containers
    // which needs to get fixed first. All tested containers so far do NOT respect the Extensions
    // from the ShrinkWrap archive but only the ones from the classpath.
    // Thus we had to add the Extension on the test-classpath. This means it will also
    // be available for all other tests (but only for 'embedded' containers.
    @Test
    public void testDummyContext()
    {
        DummyBean dummyBean = BeanProvider.getContextualReference(DummyBean.class);

        Assert.assertEquals(4711, dummyBean.getI());

        dummyBean.setI(4712);

        DummyBean dummyBean2 = BeanProvider.getContextualReference(DummyBean.class);
        Assert.assertEquals(4712, dummyBean.getI());

    }
}
