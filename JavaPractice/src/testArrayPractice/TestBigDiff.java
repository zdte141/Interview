package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.BigDiff;

public class TestBigDiff {
  // TDD to run the test if the BigDiff.java exist.
  @Before
  public void testClass() {
    BigDiff test = new BigDiff();
  }

  // TDD to run if the method bigDiff method is working properly, return the subtraction of max and
  // min number.
  @Test
  public void testBigDiff() {
    BigDiff test = new BigDiff();
    int[] nums = {10, 3, 5, 6};

    int diff = 7;

    assertTrue("find the min and max of number in the arrays and return the diff of two integer",
        test.bigDiff(nums) == diff);

  }

}
