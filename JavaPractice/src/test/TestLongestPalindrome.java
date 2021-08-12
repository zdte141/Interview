package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.LongestPalindrome;

public class TestLongestPalindrome {
  @Before
  public void testClass() {
    LongestPalindrome longestParlindrome = new LongestPalindrome();
  }

  @Test
  public void testLOngestPalindrome() {
    LongestPalindrome test = new LongestPalindrome();

    String s = "babad";
    String output = "bab";

    assertTrue("check if the longestPalindrome is found and return as the String",
        test.longestPalindrome(s).equals(output));
  }

}
