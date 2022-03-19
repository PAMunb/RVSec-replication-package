/**
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
package org.apache.openejb.test.stateful;

import javax.ejb.EJBLocalHome;

public class StatefulPojoEjbLocalObjectTests extends BasicStatefulLocalTestClient {

    public StatefulPojoEjbLocalObjectTests() {
        super("EJBLocalObject.");
    }

    protected void setUp() throws Exception {
        super.setUp();
        final Object obj = initialContext.lookup("client/tests/stateful/BasicStatefulPojoHomeLocal");
        ejbLocalHome = (BasicStatefulLocalHome) obj;
        ejbLocalObject = ejbLocalHome.create("StatefulEjbLocalObject Test Bean");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void test01_isIdentical() {
        try {
            assertTrue("The EJBObjects are not equal", ejbLocalObject.isIdentical(ejbLocalObject));
        } catch (final Exception e) {
            fail("Received Exception " + e.getClass() + " : " + e.getMessage());
        }
    }

    public void test02_getEjbLocalHome() {
        try {
            final EJBLocalHome localHome = ejbLocalObject.getEJBLocalHome();
            assertNotNull("The EJBHome is null", localHome);
        } catch (final Exception e) {
            fail("Received Exception " + e.getClass() + " : " + e.getMessage());
        }
    }

    /**
     * 3.6.5 Session object identity
     * <p/>
     * Session objects are intended to be private resources used only by the
     * client that created them. For this reason, session objects, from the
     * client's perspective, appear anonymous. In contrast to entity objects,
     * which expose their identity as a primary key, session objects hide their
     * identity. As a result, the EJBLocalObject.getPrimaryKey() method results in a
     * javax.ejb.EJBException, and EJBLocalHome.remove(Object primaryKey) method results
     * in a javax.ejb.RemoveException. If the EJBMetaData.getPrimaryKeyClass()
     * method is invoked on a EJBMetaData object for a Session bean, the method throws
     * the java.lang.RuntimeException.
     */
    public void test03_getPrimaryKey() {
        try {
            final Object key = ejbLocalObject.getPrimaryKey();
        } catch (final javax.ejb.EJBException e) {
            assertTrue(true);
            return;
        } catch (final Exception e) {
            fail("A RuntimeException should have been thrown.  Received Exception " + e.getClass() + " : " + e.getMessage());
        }
        fail("A RuntimeException should have been thrown.");
    }

    public void test04_remove() {
        try {
            try {
                ejbLocalObject.remove();
                ejbLocalObject.businessMethod("Should throw an exception");
                assertTrue("Calling business method after removing the EJBObject does not throw an exception", false);
            } catch (final Exception e) {
                assertTrue(true);
                return;
            }
        } catch (final Exception e) {
            fail("Received Exception " + e.getClass() + " : " + e.getMessage());
        }
    }

}