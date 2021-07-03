package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MiddleWay;

public class TestMiddleWay {
  // TDD to check for the MiddleWay.java
  @Before
  public void testClass() {
    MiddleWay middleWay = new MiddleWay();
  }

  // TDD to run the test whether the middleWay method is working.
  @Test
  public void testMiddleWay() {
    MiddleWay test = new MiddleWay();

    int[] a = {1, 2, 3};
    int[] b = {4, 5, 6};

    int[] result = {2, 5};

    assertTrue("check if the method middleWay give out the correct array from a and b",
        Arrays.equals(test.middleWay(a, b), result));

  }

}
