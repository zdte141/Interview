package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.LongestCommonPrefix;

/**
 * Test class with method to run the TDD development.
 * 
 * @author sanghunlee
 *
 */
public class TestLongestCommonPrefix {

  @Before
  public void testClass() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
  }

  /**
   * test to run the string array input with method will give the expected result.
   */
  @Test
  public void test() {
    LongestCommonPrefix test = new LongestCommonPrefix();
    String[] input = {"flower", "flow", "flight"};
    String result = "fl";

    assertTrue("check for the longest common prefix meets the expected result",
        test.commonPrefix(input).equals(result));
  }

}
