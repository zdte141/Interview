package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.SwapEnds;

/**
 * Test class to run the TDD.
 * 
 * @author sanghunlee
 *
 */
public class TestSwapEnds {
  // Check for the corrsponding class exist SwapEnds.java.
  @Before
  public void testClass() {
    SwapEnds swapEnds = new SwapEnds();

  }

  // TDD test method to check for the method swapEnds swap the first and end of the integer
  // elements.
  @Test
  public void testSwapEnds() {
    SwapEnds test = new SwapEnds();

    int[] nums = {1, 2, 3, 4};

    int[] result = {4, 2, 3, 1};

    assertTrue("check for the arrays return the values with swap of two ends of integer",
        Arrays.equals(test.swapEnds(nums), result));
  }

}
