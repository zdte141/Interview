package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Unlucky;

public class TestUnlucky {
  // Check for the corresponding class Unlucky.java exist.
  @Before
  public void testClass() {
    Unlucky unlucky = new Unlucky();
  }

  // Test case to make sure the method unlucky return true only if the element 3 follow by 1.
  @Test
  public void testUnlucky() {
    Unlucky test = new Unlucky();

    int[] nums = {1, 3, 4, 5};

    assertTrue("check if the number 3 is follow by 1", test.unlucky(nums) == true);
  }


}
