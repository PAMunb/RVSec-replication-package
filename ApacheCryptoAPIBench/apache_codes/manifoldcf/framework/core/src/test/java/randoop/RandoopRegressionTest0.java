package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test001");
        org.apache.manifoldcf.core.system.ManifoldCF.resetEnvironment();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test002");
        org.apache.manifoldcf.core.interfaces.IDBInterface iDBInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getChildDatabaseName(iDBInterface0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test003");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.masterDatabaseNameProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.name" + "'", str0, "org.apache.manifoldcf.database.name");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test004");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.manifoldcf.core.system.ManifoldCF.readWord(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test005");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.databaseImplementation;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.databaseimplementationclass" + "'", str0, "org.apache.manifoldcf.databaseimplementationclass");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test006");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.maintenanceFileSignalProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.maintenanceflag" + "'", str0, "org.apache.manifoldcf.database.maintenanceflag");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test007");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.initializeEnvironment(iThreadContext0);
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Initialization failed: Could not read configuration file '/home/pedro/lcf/properties.xml'");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test008");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.configSignalCommandProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.configuration.change.command" + "'", str0, "org.apache.manifoldcf.configuration.change.command");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test009");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.NODE_LIBDIR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "libdir" + "'", str0, "libdir");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test010");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.recursiveDelete(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test011");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.getMasterDatabaseName();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test012");
        org.apache.manifoldcf.core.system.ManifoldCF.deleteFolder("");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test013");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.hash("libdir");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFEEC66B546395BF37502F0A5DE4305016113A0A" + "'", str1, "FFEEC66B546395BF37502F0A5DE4305016113A0A");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.initializeEnvironment();
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Initialization failed: Could not read configuration file '/home/pedro/lcf/properties.xml'");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test015");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF._rcsid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "@(#)$Id: ManifoldCF.java 988245 2010-08-23 18:39:35Z kwright $" + "'", str0, "@(#)$Id: ManifoldCF.java 988245 2010-08-23 18:39:35Z kwright $");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test016");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.getMcfVersion();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test017");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.manifoldcf.core.system.ManifoldCF.readByte(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test018");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.versionProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.versionstring" + "'", str0, "org.apache.manifoldcf.versionstring");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test019");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.authImplementation;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.authimplementationclass" + "'", str0, "org.apache.manifoldcf.authimplementationclass");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test020");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByteArray(outputStream0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test021");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByteArray(outputStream0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 10, 1, 1]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test022");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.fileResourcesProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.fileresources" + "'", str0, "org.apache.manifoldcf.fileresources");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test023");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.masterDatabaseUsernameProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.username" + "'", str0, "org.apache.manifoldcf.database.username");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test024");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.getProcessID();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test025");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.deleteFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test026");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeString(outputStream0, "org.apache.manifoldcf.authimplementationclass");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test027");
        long long2 = org.apache.manifoldcf.core.system.ManifoldCF.getLongProperty("org.apache.manifoldcf.database.username", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test028");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.getMasterDatabasePassword();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test029");
        org.apache.manifoldcf.core.system.ManifoldCF.ensureFolder("org.apache.manifoldcf.fileresources");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test030");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.lcfConfigFileProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.configfile" + "'", str0, "org.apache.manifoldcf.configfile");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = org.apache.manifoldcf.core.system.ManifoldCF.findClass("org.apache.manifoldcf.configuration.change.command");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.manifoldcf.configuration.change.command");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test032");
        java.io.File file1 = org.apache.manifoldcf.core.system.ManifoldCF.getFileProperty("org.apache.manifoldcf.authimplementationclass");
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test033");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.getMasterDatabaseUsername();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test034");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        org.apache.manifoldcf.core.system.ManifoldCF.pollAll(iThreadContext0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test035");
        double double2 = org.apache.manifoldcf.core.system.ManifoldCF.getDoubleProperty("@(#)$Id: ManifoldCF.java 988245 2010-08-23 18:39:35Z kwright $", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test036");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.manifoldcf.core.system.ManifoldCF.readfloat(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test037");
        java.io.File file1 = org.apache.manifoldcf.core.system.ManifoldCF.getFileProperty("org.apache.manifoldcf.versionstring");
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test038");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByte(outputStream0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test039");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.manifoldcf.core.system.ManifoldCF.readLong(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test040");
        org.apache.manifoldcf.core.interfaces.IPollingHook iPollingHook0 = null;
        org.apache.manifoldcf.core.system.ManifoldCF.addPollingHook(iPollingHook0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test041");
        java.lang.String str0 = org.apache.manifoldcf.core.connectorpool.ConnectorPool._rcsid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "@(#)$Id$" + "'", str0, "@(#)$Id$");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test042");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.databaseHandleTimeoutProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.handletimeout" + "'", str0, "org.apache.manifoldcf.database.handletimeout");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test043");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.hash("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3A987ACF8CBC1028B7DBC86BD086831151899A2B" + "'", str1, "3A987ACF8CBC1028B7DBC86BD086831151899A2B");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeDword(outputStream0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test045");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.manifoldcf.core.system.ManifoldCF.readByteArray(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test046");
        java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getStringProperty("org.apache.manifoldcf.database.handletimeout", "org.apache.manifoldcf.database.maintenanceflag");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.manifoldcf.database.maintenanceflag" + "'", str2, "org.apache.manifoldcf.database.maintenanceflag");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.manifoldcf.core.system.ManifoldCF.getLongProperty("", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key can't be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test048");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray3 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] {};
        java.lang.Object[] objArray4 = queryCacheExecutor2.create(iCacheDescriptionArray3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(iCacheDescriptionArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.deobfuscate("org.apache.manifoldcf.database.handletimeout");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: javax.crypto.IllegalBlockSizeException: Input length must be multiple of 16 when decrypting with padded cipher");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test050");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByte(outputStream0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test051");
        java.io.File file1 = org.apache.manifoldcf.core.system.ManifoldCF.getFileProperty("org.apache.manifoldcf.database.handletimeout");
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test052");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.ATTRIBUTE_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "path" + "'", str0, "path");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test053");
        org.apache.manifoldcf.core.system.ManifoldCF.cleanUpEnvironment();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test054");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writefloat(outputStream0, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test055");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.databaseConnectionTrackingProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.connectiontracking" + "'", str0, "org.apache.manifoldcf.database.connectiontracking");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test056");
        org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration manifoldCFConfiguration0 = org.apache.manifoldcf.core.system.ManifoldCF.getConfiguration();
        org.junit.Assert.assertNotNull(manifoldCFConfiguration0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test057");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.obfuscate("org.apache.manifoldcf.database.handletimeout");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZtE5mSFIuIXXawVuzyTJvW4ktCuERwh+iBXm7jvmXtQVIqZofdiBcs4NpjGoT39yF9mxHNEHCOkLyZpzyA9QvQ==" + "'", str1, "ZtE5mSFIuIXXawVuzyTJvW4ktCuERwh+iBXm7jvmXtQVIqZofdiBcs4NpjGoT39yF9mxHNEHCOkLyZpzyA9QvQ==");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test058");
        java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getStringProperty("FFEEC66B546395BF37502F0A5DE4305016113A0A", "org.apache.manifoldcf.database.connectiontracking");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.manifoldcf.database.connectiontracking" + "'", str2, "org.apache.manifoldcf.database.connectiontracking");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test059");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByteArray(outputStream0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 10, 100]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test060");
        org.apache.manifoldcf.core.system.ManifoldCF.deleteFolder("@(#)$Id$");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test061");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.createSystemDatabase(iThreadContext0, "org.apache.manifoldcf.databaseimplementationclass", "org.apache.manifoldcf.versionstring");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test062");
        boolean boolean2 = org.apache.manifoldcf.core.system.ManifoldCF.getBooleanProperty("org.apache.manifoldcf.versionstring", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test063");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.processIDProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.processid" + "'", str0, "org.apache.manifoldcf.processid");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test064");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeLong(outputStream0, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test065");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.manifoldcf.core.system.ManifoldCF.readDword(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test066");
        org.apache.manifoldcf.core.interfaces.IDBInterface iDBInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getChildDatabaseName(iDBInterface0, "org.apache.manifoldcf.database.username");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test067");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeDword(outputStream0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test068");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.dropSystemDatabase(iThreadContext0, "", "org.apache.manifoldcf.configfile");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test069");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeDword(outputStream0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test070");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.safeFileName("org.apache.manifoldcf.processid");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.manifoldcf.processid" + "'", str1, "org.apache.manifoldcf.processid");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test071");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.safeFileName("DA39A3EE5E6B4B0D3255BFEF95601890AFD80709");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709" + "'", str1, "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test072");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writefloat(outputStream0, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test073");
        double double2 = org.apache.manifoldcf.core.system.ManifoldCF.getDoubleProperty("org.apache.manifoldcf.database.handletimeout", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test074");
        org.apache.manifoldcf.core.interfaces.IShutdownHook iShutdownHook0 = null;
        org.apache.manifoldcf.core.system.ManifoldCF.addShutdownHook(iShutdownHook0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test075");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.databaseHandleMaxcountProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.maxhandles" + "'", str0, "org.apache.manifoldcf.database.maxhandles");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test076");
        java.lang.String str0 = org.apache.manifoldcf.core.database.Database._rcsid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "@(#)$Id: Database.java 988245 2010-08-23 18:39:35Z kwright $" + "'", str0, "@(#)$Id: Database.java 988245 2010-08-23 18:39:35Z kwright $");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test077");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray3 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] {};
        java.lang.Object[] objArray4 = queryCacheExecutor2.create(iCacheDescriptionArray3);
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            queryCacheExecutor2.exists(iCacheDescription5, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.apache.manifoldcf.core.interfaces.IResultSet");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iCacheDescriptionArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test078");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        org.apache.manifoldcf.core.system.ManifoldCF.resetEnvironment(iThreadContext0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test079");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.manifoldcf.core.system.ManifoldCF.readSdword(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("org.apache.manifoldcf.database.maintenanceflag", "org.apache.manifoldcf.database.connectiontracking", "org.apache.manifoldcf.database.maintenanceflag");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Unexpected end of base64 input");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test081");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.lockManagerImplementation;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.lockmanagerclass" + "'", str0, "org.apache.manifoldcf.lockmanagerclass");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.manifoldcf.core.system.ManifoldCF.getLongProperty("", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key can't be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test083");
        org.apache.manifoldcf.core.system.ManifoldCF manifoldCF0 = new org.apache.manifoldcf.core.system.ManifoldCF();
        java.lang.Class<?> wildcardClass1 = manifoldCF0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test084");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeString(outputStream0, "org.apache.manifoldcf.fileresources");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test085");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.databaseQueryMaxTimeProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.maxquerytime" + "'", str0, "org.apache.manifoldcf.database.maxquerytime");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test086");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByteArray(outputStream0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 10]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test087");
        double double2 = org.apache.manifoldcf.core.system.ManifoldCF.getDoubleProperty("path", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test088");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeString(outputStream0, "ZtE5mSFIuIXXawVuzyTJvW4ktCuERwh+iBXm7jvmXtQVIqZofdiBcs4NpjGoT39yF9mxHNEHCOkLyZpzyA9QvQ==");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test089");
        org.apache.manifoldcf.core.system.ManifoldCFResourceLoader manifoldCFResourceLoader0 = org.apache.manifoldcf.core.system.ManifoldCF.createResourceLoader();
        org.junit.Assert.assertNotNull(manifoldCFResourceLoader0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test090");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeLong(outputStream0, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test091");
        java.lang.String str0 = org.apache.manifoldcf.core.interfaces.ICacheExecutor._rcsid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "@(#)$Id: ICacheExecutor.java 988245 2010-08-23 18:39:35Z kwright $" + "'", str0, "@(#)$Id: ICacheExecutor.java 988245 2010-08-23 18:39:35Z kwright $");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test092");
        org.apache.manifoldcf.core.system.ManifoldCF.ensureFolder("@(#)$Id$");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test093");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writefloat(outputStream0, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test094");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeSdword(outputStream0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test095");
        org.apache.manifoldcf.core.system.ManifoldCF.deleteFolder("libdir");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test096");
        java.lang.String str0 = org.apache.manifoldcf.core.cachemanager.ExecutorBase._rcsid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "@(#)$Id: ExecutorBase.java 988245 2010-08-23 18:39:35Z kwright $" + "'", str0, "@(#)$Id: ExecutorBase.java 988245 2010-08-23 18:39:35Z kwright $");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test097");
        org.apache.manifoldcf.core.system.ManifoldCF.deleteFolder("org.apache.manifoldcf.database.connectiontracking");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test098");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray3 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] {};
        java.lang.Object[] objArray4 = queryCacheExecutor2.create(iCacheDescriptionArray3);
        queryCacheExecutor2.execute();
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription6 = null;
        java.lang.Object obj7 = null;
        queryCacheExecutor2.exists(iCacheDescription6, obj7);
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription9 = null;
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray10 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] { iCacheDescription9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = queryCacheExecutor2.create(iCacheDescriptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iCacheDescriptionArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iCacheDescriptionArray10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("org.apache.manifoldcf.fileresources", "org.apache.manifoldcf.fileresources", "org.apache.manifoldcf.configfile");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Unexpected end of base64 input");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test100");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.configuration.change.command");
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.databaseimplementationclass");
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "ZtE5mSFIuIXXawVuzyTJvW4ktCuERwh+iBXm7jvmXtQVIqZofdiBcs4NpjGoT39yF9mxHNEHCOkLyZpzyA9QvQ==");
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <in progress>\n");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test101");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray3 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] {};
        java.lang.Object[] objArray4 = queryCacheExecutor2.create(iCacheDescriptionArray3);
        queryCacheExecutor2.execute();
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription6 = null;
        java.lang.Object obj7 = null;
        queryCacheExecutor2.exists(iCacheDescription6, obj7);
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            queryCacheExecutor2.exists(iCacheDescription9, (java.lang.Object) "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.manifoldcf.core.interfaces.IResultSet");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iCacheDescriptionArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test102");
        java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getStringProperty("BE590EB5F615BE97AAB64AB9F9393EF9E74FF0A1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test103");
        java.io.File file2 = org.apache.manifoldcf.core.system.ManifoldCF.createTempDir("org.apache.manifoldcf.fileresources", "org.apache.manifoldcf.configuration.change.command");
        org.apache.manifoldcf.core.system.ManifoldCF.recursiveDelete(file2);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/org.apache.manifoldcf.fileresources53043012912274org.apache.manifoldcf.configuration.change.command");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test104");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeDword(outputStream0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("org.apache.manifoldcf.database.connectiontracking", "libdir", "org.apache.manifoldcf.configuration.change.command");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Unexpected end of base64 input");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test106");
        org.apache.manifoldcf.core.interfaces.IDBInterface iDBInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getChildDatabaseName(iDBInterface0, "@(#)$Id: ManifoldCF.java 988245 2010-08-23 18:39:35Z kwright $");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test107");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        org.apache.manifoldcf.core.system.ManifoldCF.cleanUpEnvironment(iThreadContext0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = org.apache.manifoldcf.core.system.ManifoldCF.findClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test109");
        org.apache.manifoldcf.core.interfaces.IDBInterface iDBInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getChildDatabaseName(iDBInterface0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test110");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.configuration.change.command");
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.databaseimplementationclass");
        java.lang.String str5 = org.apache.manifoldcf.core.system.ManifoldCF.getHashValue(messageDigest0);
        java.lang.Class<?> wildcardClass6 = messageDigest0.getClass();
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <initialized>\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BE590EB5F615BE97AAB64AB9F9393EF9E74FF0A1" + "'", str5, "BE590EB5F615BE97AAB64AB9F9393EF9E74FF0A1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test111");
        org.apache.manifoldcf.core.interfaces.IDBInterface iDBInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getChildDatabaseName(iDBInterface0, "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test112");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeLong(outputStream0, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("org.apache.manifoldcf.database.handletimeout", "path", "@(#)$Id: Database.java 988245 2010-08-23 18:39:35Z kwright $");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Unexpected end of base64 input");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test114");
        boolean boolean0 = org.apache.manifoldcf.core.system.ManifoldCF.checkMaintenanceUnderway();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test115");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.getHashValue(messageDigest0);
        java.lang.Class<?> wildcardClass2 = messageDigest0.getClass();
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <initialized>\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709" + "'", str1, "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("DA39A3EE5E6B4B0D3255BFEF95601890AFD80709", "org.apache.manifoldcf.database.maxquerytime", "@(#)$Id: ICacheExecutor.java 988245 2010-08-23 18:39:35Z kwright $");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: javax.crypto.IllegalBlockSizeException: Input length must be multiple of 16 when decrypting with padded cipher");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test117");
        java.io.File file2 = org.apache.manifoldcf.core.system.ManifoldCF.createTempDir("DA39A3EE5E6B4B0D3255BFEF95601890AFD80709", "org.apache.manifoldcf.configfile");
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/DA39A3EE5E6B4B0D3255BFEF95601890AFD8070953043012907303org.apache.manifoldcf.configfile");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test118");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.configuration.change.command");
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.databaseimplementationclass");
        java.lang.String str5 = org.apache.manifoldcf.core.system.ManifoldCF.getHashValue(messageDigest0);
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "");
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <in progress>\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BE590EB5F615BE97AAB64AB9F9393EF9E74FF0A1" + "'", str5, "BE590EB5F615BE97AAB64AB9F9393EF9E74FF0A1");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test119");
        org.apache.manifoldcf.core.system.ManifoldCF.ensureFolder("@(#)$Id: ICacheExecutor.java 988245 2010-08-23 18:39:35Z kwright $");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test120");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test121");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray3 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] {};
        java.lang.Object[] objArray4 = queryCacheExecutor2.create(iCacheDescriptionArray3);
        org.apache.manifoldcf.core.interfaces.IResultSet iResultSet5 = queryCacheExecutor2.getResult();
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription6 = null;
        // The following exception was thrown during execution in test generation
        try {
            queryCacheExecutor2.exists(iCacheDescription6, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.apache.manifoldcf.core.interfaces.IResultSet");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iCacheDescriptionArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(iResultSet5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("3A987ACF8CBC1028B7DBC86BD086831151899A2B", "org.apache.manifoldcf.database.username", "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: javax.crypto.IllegalBlockSizeException: Input length must be multiple of 16 when decrypting with padded cipher");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test123");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByte(outputStream0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test124");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.createSystemDatabase(iThreadContext0, "org.apache.manifoldcf.authimplementationclass", "org.apache.manifoldcf.fileresources");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test125");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeDword(outputStream0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test126");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.createSystemDatabase(iThreadContext0, "org.apache.manifoldcf.fileresources", "org.apache.manifoldcf.fileresources");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.sleep((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test128");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeWord(outputStream0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test129");
        java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getStringProperty("libdir", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test130");
        int int2 = org.apache.manifoldcf.core.system.ManifoldCF.getIntProperty("@(#)$Id: ICacheExecutor.java 988245 2010-08-23 18:39:35Z kwright $", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test131");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.configuration.change.command");
        java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.getHashValue(messageDigest0);
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <initialized>\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7C1F14D81BDD777368102E4AE7450F11F58E1251" + "'", str3, "7C1F14D81BDD777368102E4AE7450F11F58E1251");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test132");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeLong(outputStream0, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test133");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeSdword(outputStream0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test134");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeBytes(outputStream0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test135");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.masterDatabasePasswordProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.database.password" + "'", str0, "org.apache.manifoldcf.database.password");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.deobfuscate("org.apache.manifoldcf.processid");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: javax.crypto.IllegalBlockSizeException: Input length must be multiple of 16 when decrypting with padded cipher");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("path", "org.apache.manifoldcf.database.connectiontracking", "org.apache.manifoldcf.lockmanagerclass");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Unexpected end of base64 input");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test138");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray3 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] {};
        java.lang.Object[] objArray4 = queryCacheExecutor2.create(iCacheDescriptionArray3);
        queryCacheExecutor2.execute();
        queryCacheExecutor2.execute();
        org.junit.Assert.assertNotNull(iCacheDescriptionArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test139");
        org.apache.manifoldcf.core.system.ManifoldCF.ensureFolder("org.apache.manifoldcf.database.connectiontracking");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test140");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByteArray(outputStream0, byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, -1]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test141");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.obfuscate("@(#)$Id: ManifoldCF.java 988245 2010-08-23 18:39:35Z kwright $");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "56xwHKHSJeT+qZ8OUCKgqiyJ7o7yMYojLqGtANTE4kbA2mtFK1RemHBJ4DrTPYNKcudEuxTRXTAQC0ND4JkzO9Z6R0/uAiql5M1QG75OeOw=" + "'", str1, "56xwHKHSJeT+qZ8OUCKgqiyJ7o7yMYojLqGtANTE4kbA2mtFK1RemHBJ4DrTPYNKcudEuxTRXTAQC0ND4JkzO9Z6R0/uAiql5M1QG75OeOw=");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test142");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.saltProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.salt" + "'", str0, "org.apache.manifoldcf.salt");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test143");
        double double2 = org.apache.manifoldcf.core.system.ManifoldCF.getDoubleProperty("BE590EB5F615BE97AAB64AB9F9393EF9E74FF0A1", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test144");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeDword(outputStream0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Attempt to use an unsigned operator to write a signed value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test145");
        org.apache.manifoldcf.core.system.ManifoldCF.deleteFolder("@(#)$Id: ExecutorBase.java 988245 2010-08-23 18:39:35Z kwright $");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test146");
        java.io.File file1 = org.apache.manifoldcf.core.system.ManifoldCF.resolvePath("org.apache.manifoldcf.database.connectiontracking");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/home/pedro/lcf");
        org.junit.Assert.assertEquals(file1.toString(), "/home/pedro/lcf/org.apache.manifoldcf.database.connectiontracking");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test147");
        org.apache.manifoldcf.core.system.ManifoldCF.deleteFolder("org.apache.manifoldcf.database.handletimeout");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test148");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writefloat(outputStream0, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test149");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.dropSystemDatabase(iThreadContext0, "org.apache.manifoldcf.lockmanagerclass", "@(#)$Id$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test150");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeSdword(outputStream0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test151");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByteArray(outputStream0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = org.apache.manifoldcf.core.system.ManifoldCF.findClass("libdir");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: libdir");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test153");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.getHashValue(messageDigest0);
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.database.maxhandles");
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <in progress>\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709" + "'", str1, "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test154");
        org.apache.manifoldcf.core.interfaces.IDBInterface iDBInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.manifoldcf.core.system.ManifoldCF.getChildDatabaseName(iDBInterface0, "org.apache.manifoldcf.processid");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test155");
        boolean boolean1 = org.apache.manifoldcf.core.system.ManifoldCF.isFolder("path");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test156");
        org.apache.manifoldcf.core.system.ManifoldCF.noteConfigurationChange();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test157");
        org.apache.manifoldcf.core.interfaces.IThreadContext iThreadContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.dropSystemDatabase(iThreadContext0, "org.apache.manifoldcf.database.connectiontracking", "org.apache.manifoldcf.configfile");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test158");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.configuration.change.command");
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.processid");
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.fileresources");
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <in progress>\n");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test159");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writefloat(outputStream0, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test160");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.readBytes(inputStream0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test161");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.readString(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test162");
        java.io.File file1 = org.apache.manifoldcf.core.system.ManifoldCF.getFileProperty("org.apache.manifoldcf.database.connectiontracking");
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test163");
        java.io.File file1 = org.apache.manifoldcf.core.system.ManifoldCF.resolvePath("org.apache.manifoldcf.fileresources");
        org.apache.manifoldcf.core.system.ManifoldCF.recursiveDelete(file1);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/home/pedro/lcf");
        org.junit.Assert.assertEquals(file1.toString(), "/home/pedro/lcf/org.apache.manifoldcf.fileresources");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test164");
        boolean boolean1 = org.apache.manifoldcf.core.system.ManifoldCF.isFolder("56xwHKHSJeT+qZ8OUCKgqiyJ7o7yMYojLqGtANTE4kbA2mtFK1RemHBJ4DrTPYNKcudEuxTRXTAQC0ND4JkzO9Z6R0/uAiql5M1QG75OeOw=");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test165");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.safeFileName("org.apache.manifoldcf.configfile");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.manifoldcf.configfile" + "'", str1, "org.apache.manifoldcf.configfile");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test166");
        java.io.File file2 = org.apache.manifoldcf.core.system.ManifoldCF.createTempDir("org.apache.manifoldcf.database.maintenanceflag", "org.apache.manifoldcf.database.maxquerytime");
        org.apache.manifoldcf.core.system.ManifoldCF.recursiveDelete(file2);
        org.apache.manifoldcf.core.system.ManifoldCF.recursiveDelete(file2);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/org.apache.manifoldcf.database.maintenanceflag53043012897693org.apache.manifoldcf.database.maxquerytime");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test167");
        java.security.MessageDigest messageDigest0 = org.apache.manifoldcf.core.system.ManifoldCF.startHash();
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "org.apache.manifoldcf.configuration.change.command");
        org.apache.manifoldcf.core.system.ManifoldCF.addToHash(messageDigest0, "path");
        org.junit.Assert.assertNotNull(messageDigest0);
        org.junit.Assert.assertEquals(messageDigest0.toString(), "SHA Message Digest from SUN, <in progress>\n");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test168");
        boolean boolean2 = org.apache.manifoldcf.core.system.ManifoldCF.getBooleanProperty("org.apache.manifoldcf.database.maxquerytime", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test169");
        java.lang.String str0 = org.apache.manifoldcf.core.system.ManifoldCF.logConfigFileProperty;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.manifoldcf.logconfigfile" + "'", str0, "org.apache.manifoldcf.logconfigfile");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test170");
        java.io.File file2 = org.apache.manifoldcf.core.system.ManifoldCF.createTempDir("@(#)$Id: ManifoldCF.java 988245 2010-08-23 18:39:35Z kwright $", "org.apache.manifoldcf.versionstring");
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/@(#)$Id: ManifoldCF.java 988245 2010-08-23 18:39:35Z kwright $53043012892225org.apache.manifoldcf.versionstring");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test171");
        boolean boolean1 = org.apache.manifoldcf.core.system.ManifoldCF.isFolder("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test172");
        java.io.OutputStream outputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeByteArray(outputStream0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.manifoldcf.core.system.ManifoldCF.decrypt("org.apache.manifoldcf.database.maxquerytime", "", "org.apache.manifoldcf.authimplementationclass");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Unexpected end of base64 input");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test174");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            queryCacheExecutor2.exists(iCacheDescription3, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.apache.manifoldcf.core.interfaces.IResultSet");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test175");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.safeFileName("org.apache.manifoldcf.database.maxquerytime");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.manifoldcf.database.maxquerytime" + "'", str1, "org.apache.manifoldcf.database.maxquerytime");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test176");
        org.apache.manifoldcf.core.database.Database database0 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor2 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database0, true);
        org.apache.manifoldcf.core.database.Database database3 = null;
        org.apache.manifoldcf.core.database.Database.QueryCacheExecutor queryCacheExecutor5 = new org.apache.manifoldcf.core.database.Database.QueryCacheExecutor(database3, true);
        org.apache.manifoldcf.core.interfaces.ICacheDescription[] iCacheDescriptionArray6 = new org.apache.manifoldcf.core.interfaces.ICacheDescription[] {};
        java.lang.Object[] objArray7 = queryCacheExecutor5.create(iCacheDescriptionArray6);
        java.lang.Object[] objArray8 = queryCacheExecutor2.create(iCacheDescriptionArray6);
        org.apache.manifoldcf.core.interfaces.ICacheDescription iCacheDescription9 = null;
        java.lang.Object obj10 = null;
        queryCacheExecutor2.exists(iCacheDescription9, obj10);
        org.junit.Assert.assertNotNull(iCacheDescriptionArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test177");
        java.io.File file1 = org.apache.manifoldcf.core.system.ManifoldCF.getFileProperty("org.apache.manifoldcf.configuration.change.command");
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test178");
        double double2 = org.apache.manifoldcf.core.system.ManifoldCF.getDoubleProperty("ZtE5mSFIuIXXawVuzyTJvW4ktCuERwh+iBXm7jvmXtQVIqZofdiBcs4NpjGoT39yF9mxHNEHCOkLyZpzyA9QvQ==", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test179");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.readBytes(inputStream0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test180");
        java.io.File file2 = org.apache.manifoldcf.core.system.ManifoldCF.createTempDir("org.apache.manifoldcf.database.maxquerytime", "org.apache.manifoldcf.salt");
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/tmp");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/tmp/org.apache.manifoldcf.database.maxquerytime53043012893803org.apache.manifoldcf.salt");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test181");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.manifoldcf.core.system.ManifoldCF.writeLong(outputStream0, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test182");
        java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.getProperty("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.manifoldcf.core.system.ManifoldCF.deobfuscate("org.apache.manifoldcf.database.maintenanceflag");
            org.junit.Assert.fail("Expected exception of type org.apache.manifoldcf.core.interfaces.ManifoldCFException; message: Unexpected end of base64 input");
        } catch (org.apache.manifoldcf.core.interfaces.ManifoldCFException e) {
            // Expected exception.
        }
    }
}
