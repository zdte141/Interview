package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Sum13;

public class TestSum13 {
  // TDD to check if the corresponding class exist.
  @Before
  public void testClass() {
    Sum13 sum13 = new Sum13();
  }

  // TDD to check the method sum13 is working, it has to only add up all elements just before
  // element 13 is
  @Test
  public void testSum13() {
    // construct the test with Sum13 class.
    Sum13 test = new Sum13();
    // initialise the arrays of integers.
    int[] nums = {1, 2, 2, 1, 13, 5, 7};
    // int sum has to be 6.
    int sum = 6;
    // Unit testing to run the method sum13 is giving back the expected result.
    assertTrue("check if the method sum13 only sum all the numbers excep 0 and 13",
        test.sum13(nums) == sum);
  }

}
