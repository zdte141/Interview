package TestRecursion;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import Recursion.Triangle;

public class TestTriangle {
  @Before
  public void testClass() {
    Triangle triangle = new Triangle();
  }

  @Test
  public void testTriangle() {
    Triangle test = new Triangle();

    int rows = 0;

    assertTrue("check recursion method triangle give back the triangle number",
        test.triangle(rows) == 0);
  }

  @Test
  public void test1() {
    Triangle test1 = new Triangle();

    int rows = 2;
    int result = 3;

    assertTrue("check again with different input value", test1.triangle(rows) == result);
  }

  @Test
  public void test2() {
    Triangle test2 = new Triangle();

    int rows = 3;
    int result = 6;
    System.out.println(test2.triangle(rows));
    assertTrue("check test 2 case", test2.triangle(rows) == result);

  }

}
