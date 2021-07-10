package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.BiggerTwo;

public class TestBiggerTwo {
  // TDD to check for the class BiggerTwo.java
  @Before
  public void testClass() {
    BiggerTwo biggerTwo = new BiggerTwo();
  }

  // TDD to check for the method.
  @Test
  public void test() {
    BiggerTwo test = new BiggerTwo();

    int[] a = {1, 2};
    int[] b = {3, 4};

    assertTrue("compare the two arrays by sum of their number and return the array.",
        Arrays.equals(test.biggerTwo(a, b), b));
  }

}
