package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MaxSpan;

public class TestMaxSpan {
  // TDD to check for the corresponding class MaxSpan.java exist to make the method.
  @Before
  public void testClass() {
    MaxSpan maxSpan = new MaxSpan();
  }

  // TDD to run the method maxSpan to check it give back the correct result.
  @Test
  public void testMaxSpan() {
    MaxSpan test = new MaxSpan();

    int[] nums = {1, 2, 1, 1, 3};

    int result = 4;

    assertTrue("maxSpan of the number is ", test.maxSpan(nums) == result);
  }

}
