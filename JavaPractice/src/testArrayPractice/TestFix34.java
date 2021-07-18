package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Fix34;

/*
 * TDD Test class to run method fix34.
 */
public class TestFix34 {
  // TDD to check if there is class Fix.34 exist.
  @Before
  public void testClass() {
    Fix34 fix34 = new Fix34();
  }

  /**
   * TDD to run the method fix34 under condition, if it meets the input meets the result value.
   */
  @Test
  public void testFix34() {
    Fix34 test = new Fix34();

    int[] nums = {1, 3, 1, 4};
    int[] result = {1, 3, 4, 1};

    assertTrue("method fix34 will result reallocating the element 3 just after 4 to have result",
        Arrays.equals(test.fix34(nums), result));
  }

  /*
   * @Test public void testAgain() { Fix34 test = new Fix34();
   * 
   * int[] nums = {1, 3, 1, 4, 4, 3, 1}; int[] result = {1, 3, 4, 1, 1, 3, 4};
   * 
   * assertTrue("method fix34 will result reallocating the element 3 just after 4 to have result",
   * Arrays.equals(test.fix34(nums), result)); }
   */

}
