package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Has23;

public class TestHas23 {
  // TDD to check the class Has23.java exist.
  @Before
  public void testClass() {
    Has23 has23 = new Has23();
  }

  // TDD to check if the method has23 working properly.
  @Test
  public void testHas23() {
    Has23 test = new Has23();

    int[] nums = {2, 5};

    assertTrue("check if the array contains the element 2 or 3", test.has23(nums) == true);
  }

  // another test case to give more vairaiant of test case
  @Test
  public void testAgain() {
    Has23 test = new Has23();
    int[] nums2 = {4, 3};

    assertTrue("check if the array contains the elements 2 or 3", test.has23(nums2) == true);

  }

}
