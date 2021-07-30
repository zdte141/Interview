package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;
import ArrayPractice.ZeroMax;

public class TestZeroMax {
  // TDD to check the class ZeroMax.java exist.
  @Test
  public void testClass() {
    ZeroMax zeroMax = new ZeroMax();

  }

  // TDD to run the method is working.
  @Test
  public void testZeroMax() {
    ZeroMax test = new ZeroMax();

    int[] nums = {0, 5, 0, 3};

    int[] result = {5, 5, 3, 3};

    assertTrue("check if the two integer arrays is equal after using method zeroMax",
        Arrays.equals(test.zeroMax(nums), result));
  }

  // TDD to check again the methd is working
  @Test
  public void testAgain() {
    ZeroMax test2 = new ZeroMax();

    int[] nums = {0, 4, 0, 3};
    int[] result = {3, 4, 3, 3};

    assertTrue("check if the two integer arrays is equal after using method zeroMax",
        Arrays.equals(test2.zeroMax(nums), result));
  }

}
