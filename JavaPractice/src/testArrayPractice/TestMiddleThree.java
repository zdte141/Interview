package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MiddleThree;

// TDD class to check if the MiddleThree.java exist and run the test case.
public class TestMiddleThree {
  // TDD to check if the MiddleThree.java exist.
  @Before
  public void testClass() {
    MiddleThree middleThree = new MiddleThree();
  }

  // TDD to run the middleThree method under the input and expected output values.
  @Test
  public void testMiddleThree() {
    MiddleThree test = new MiddleThree();

    int[] nums = {1, 2, 3, 4, 5};
    int[] result = {2, 3, 4};

    assertTrue("check if the method return the middle three integer in the array",
        Arrays.equals(test.middleThree(nums), result));
  }

}
