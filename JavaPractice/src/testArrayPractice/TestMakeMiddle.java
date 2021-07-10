package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MakeMiddle;

public class TestMakeMiddle {
  // TDD to check the class MakeMiddle.java exist.
  @Before
  public void testClass() {
    MakeMiddle makeMiddle = new MakeMiddle();
  }

  // Test to check the method makeMiddle is working to return the middle two numbers.
  @Test
  public void testMakeMiddle() {
    MakeMiddle test = new MakeMiddle();

    int[] nums = {7, 1, 2, 3, 4, 9};

    int[] result = {2, 3};

    assertTrue("method makeMiddle must return the middle numbers in integer nums",
        Arrays.equals(test.makeMiddle(nums), result));
  }

}
