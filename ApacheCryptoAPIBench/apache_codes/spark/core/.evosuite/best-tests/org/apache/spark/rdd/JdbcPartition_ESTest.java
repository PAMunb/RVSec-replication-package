/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:26:31 GMT 2022
 */

package org.apache.spark.rdd;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.rdd.JdbcPartition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JdbcPartition_ESTest extends JdbcPartition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(0, 1407L, 0);
      assertEquals(0, jdbcPartition0.index());
      assertEquals(1407L, jdbcPartition0.lower());
      assertEquals(0L, jdbcPartition0.upper());
      assertNotNull(jdbcPartition0);
      
      long long0 = jdbcPartition0.upper();
      assertEquals(0, jdbcPartition0.index());
      assertEquals(1407L, jdbcPartition0.lower());
      assertEquals(0L, jdbcPartition0.upper());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition((-1), 1867L, (-1));
      assertEquals((-1L), jdbcPartition0.upper());
      assertEquals((-1), jdbcPartition0.index());
      assertEquals(1867L, jdbcPartition0.lower());
      assertNotNull(jdbcPartition0);
      
      long long0 = jdbcPartition0.upper();
      assertEquals((-1L), jdbcPartition0.upper());
      assertEquals((-1), jdbcPartition0.index());
      assertEquals(1867L, jdbcPartition0.lower());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition((-2386), 0L, (-1L));
      assertEquals(0L, jdbcPartition0.lower());
      assertEquals((-1L), jdbcPartition0.upper());
      assertEquals((-2386), jdbcPartition0.index());
      assertNotNull(jdbcPartition0);
      
      long long0 = jdbcPartition0.lower();
      assertEquals(0L, jdbcPartition0.lower());
      assertEquals((-1L), jdbcPartition0.upper());
      assertEquals((-2386), jdbcPartition0.index());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(0, (-3672L), 1827L);
      assertEquals(1827L, jdbcPartition0.upper());
      assertEquals((-3672L), jdbcPartition0.lower());
      assertEquals(0, jdbcPartition0.index());
      assertNotNull(jdbcPartition0);
      
      long long0 = jdbcPartition0.lower();
      assertEquals(1827L, jdbcPartition0.upper());
      assertEquals((-3672L), jdbcPartition0.lower());
      assertEquals(0, jdbcPartition0.index());
      assertEquals((-3672L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(0, 0, 0);
      assertEquals(0, jdbcPartition0.index());
      assertEquals(0L, jdbcPartition0.lower());
      assertEquals(0L, jdbcPartition0.upper());
      assertNotNull(jdbcPartition0);
      
      int int0 = jdbcPartition0.index();
      assertEquals(0, jdbcPartition0.index());
      assertEquals(0L, jdbcPartition0.lower());
      assertEquals(0L, jdbcPartition0.upper());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition((-1), 1867L, (-1));
      assertEquals((-1), jdbcPartition0.index());
      assertEquals((-1L), jdbcPartition0.upper());
      assertEquals(1867L, jdbcPartition0.lower());
      assertNotNull(jdbcPartition0);
      
      int int0 = jdbcPartition0.index();
      assertEquals((-1), jdbcPartition0.index());
      assertEquals((-1L), jdbcPartition0.upper());
      assertEquals(1867L, jdbcPartition0.lower());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(360, 360, 360);
      assertEquals(360, jdbcPartition0.index());
      assertEquals(360L, jdbcPartition0.upper());
      assertEquals(360L, jdbcPartition0.lower());
      assertNotNull(jdbcPartition0);
      
      boolean boolean0 = jdbcPartition0.equals((Object) null);
      assertEquals(360, jdbcPartition0.index());
      assertEquals(360L, jdbcPartition0.upper());
      assertEquals(360L, jdbcPartition0.lower());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(360, 360, 360);
      assertEquals(360L, jdbcPartition0.lower());
      assertEquals(360L, jdbcPartition0.upper());
      assertEquals(360, jdbcPartition0.index());
      assertNotNull(jdbcPartition0);
      
      int int0 = jdbcPartition0.index();
      assertEquals(360L, jdbcPartition0.lower());
      assertEquals(360L, jdbcPartition0.upper());
      assertEquals(360, jdbcPartition0.index());
      assertEquals(360, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(1605, 1605, 1605);
      assertEquals(1605, jdbcPartition0.index());
      assertEquals(1605L, jdbcPartition0.lower());
      assertEquals(1605L, jdbcPartition0.upper());
      assertNotNull(jdbcPartition0);
      
      boolean boolean0 = jdbcPartition0.equals(jdbcPartition0);
      assertEquals(1605, jdbcPartition0.index());
      assertEquals(1605L, jdbcPartition0.lower());
      assertEquals(1605L, jdbcPartition0.upper());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(52, 52, 52);
      assertEquals(52L, jdbcPartition0.upper());
      assertEquals(52, jdbcPartition0.index());
      assertEquals(52L, jdbcPartition0.lower());
      assertNotNull(jdbcPartition0);
      
      long long0 = jdbcPartition0.lower();
      assertEquals(52L, jdbcPartition0.upper());
      assertEquals(52, jdbcPartition0.index());
      assertEquals(52L, jdbcPartition0.lower());
      assertEquals(52L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(52, 52, 52);
      long long0 = jdbcPartition0.upper();
      assertEquals(52L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JdbcPartition jdbcPartition0 = new JdbcPartition(1605, 1605, 1605);
      jdbcPartition0.hashCode();
      assertEquals(1605, jdbcPartition0.index());
  }
}
