package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Double23;

public class TestDouble23 {
  // TDD to check for the class Double23.java exist.
  @Before
  public void testClass() {
    Double23 double23 = new Double23();
  }

  // TDD to check for the method is correct.
  @Test
  public void testDouble23() {
    Double23 test = new Double23();

    int[] nums = {2, 2};

    assertTrue("If the array contains the number 2 twice or 3 twice", test.double23(nums) == true);
  }

  // TDD to check again with different variable.
  @Test
  public void testAgain() {
    Double23 test2 = new Double23();

    int[] nums2 = {3, 3};

    assertTrue("test again in different variable ", test2.double23(nums2) == true);
  }

  @Test
  public void testOutOfLength() {
    Double23 test3 = new Double23();

    int[] out = {0, 2, 0, 2};

    assertTrue("check the new implementation works", test3.double23(out) == true);
  }
}
