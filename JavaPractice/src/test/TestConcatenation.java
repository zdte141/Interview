package test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Concatenation;

/**
 * Test class for the Concatenation.java.
 * 
 * @author sanghunlee
 *
 */
public class TestConcatenation {
  // TDD to check if there is class Concatenation exist in the package to run the test.
  @Before
  public void testClass() {
    Concatenation concatenation = new Concatenation();
  }

  // TDD to check if the new arrays with expected values.
  @Test
  public void testConcatenation() {
    Concatenation test = new Concatenation();

    int[] nums = {1, 2, 1};

    int[] result = {1, 2, 1, 1, 2, 1};
    // compare the actual and expected value to identify it's the correct method.
    assertTrue("check new arrays has the double the size and cloned same value into the array",
        Arrays.equals(test.concatenate(nums), result));
  }

}
