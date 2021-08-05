package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.LOLS;

public class TestLengthOfLongestSubstring {
  @Before
  public void testLengthOfLongestSubstring() {
    LOLS losl = new LOLS();
  }

  @Test
  public void testLengthOflongestSubstring() {
    LOLS test = new LOLS();

    String input = "abcabcbb";
    int output = 3;

    assertTrue("the answer is abc, with the length of 3",
        test.lengthOfLongestSubstring(input) == output);
  }

}
