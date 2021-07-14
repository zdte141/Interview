package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.CountEvens;

/**
 * Test class to run the CountEvens method.
 * 
 * @author sanghunlee
 *
 */
public class TestCountEvens {
  // TDD to check if the class CountEvens exist.
  @Before
  public void testClass() {
    CountEvens countEvens = new CountEvens();
  }

  // TDD to run the method countEvens, return number of even integer count in the array.
  @Test
  public void testCountEvens() {
    CountEvens test = new CountEvens();

    int[] nums = {2, 1, 2, 3, 4};
    int count = 3;

    assertTrue("count the number of even numbers in the integer and return integer values",
        test.countEvens(nums) == count);
  }

}
