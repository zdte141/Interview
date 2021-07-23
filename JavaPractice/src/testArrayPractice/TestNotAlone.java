package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.NotAlone;

/**
 * TestNotAlone to run TDD for NotAlone.java.
 * 
 * @author sanghunlee
 *
 */
public class TestNotAlone {
  // TDD to check NotAlone.java exist to run the test.
  @Before
  public void testClass() {
    NotAlone notAlone = new NotAlone();
  }

  // check for method notAlone is working with input and expected output.
  @Test
  public void testNotAlone() {
    NotAlone test = new NotAlone();

    int[] nums = {1, 2, 3};

    int alone = 2;

    int[] result = {1, 3, 3};
    System.out.println("First test case : ");
    assertTrue(
        "check method notAlone replace the alone value to which ever bigger number on left or right",
        Arrays.equals(test.notAlone(nums, alone), result));
  }

  // run another test case with different input values.
  @Test
  public void testAgain() {
    NotAlone test2 = new NotAlone();

    int[] nums = {1, 2, 3, 2, 5, 2};
    int alone = 2;
    int[] result = {1, 3, 3, 5, 5, 2};
    System.out.println("Second test case : ");
    assertTrue(
        "check method notAlone replace the alone value to which ever bigger number on left or right",
        Arrays.equals(test2.notAlone(nums, alone), result));
  }

}
