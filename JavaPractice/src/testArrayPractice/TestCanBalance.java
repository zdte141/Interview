package testArrayPractice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.CanBalance;

/**
 * Test class to drive TDD
 * 
 * @author sanghunlee
 *
 */
public class TestCanBalance {
  // TDD to check the corresponding class is exist to carry the TDD.
  @Before
  public void testClass() {
    CanBalance canBalance = new CanBalance();
  }

  // TDD to check if the method canBalance works.
  @Test
  public void testCanBalance() {
    CanBalance test = new CanBalance();

    int[] nums = {1, 1, 1, 2, 1};

    assertTrue(
        "check if the method can split the values to make sum of equal number on one side to other",
        test.canBalance(nums) == true);
  }

  // Test again in different input values.
  @Test
  public void testAgain() {
    CanBalance test = new CanBalance();
    int[] nums = {2, 1, 1, 2, 1};
    assertFalse("test again", test.canBalance(nums) == true);
  }

}
