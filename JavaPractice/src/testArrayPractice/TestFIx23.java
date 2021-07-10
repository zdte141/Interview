package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Fix23;

public class TestFIx23 {
  // TDD to check the corresponding the class itself.
  @Before
  public void testClass() {
    Fix23 fix23 = new Fix23();
  }

  // TDD to check for the method is working
  @Test
  public void test() {
    Fix23 test = new Fix23();

    int[] nums = {1, 2, 3};

    int[] result = {1, 2, 0};
    /*
     * List<Integer> temp = new ArrayList<>(); temp.add(1); temp.add(2); temp.add(0);
     */
    // assertTrue("check if the method fix23 is correctly working", test.fix23(nums).equals(temp));
    assertTrue("check another way", Arrays.equals(test.fix23(nums), result));
  }

}
