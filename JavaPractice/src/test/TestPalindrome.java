package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Palindrome;

public class TestPalindrome {
  // test if there is the corresponding class exist.
  @Before
  public void testClass() {
    Palindrome palindrome = new Palindrome();
  }

  // test case to check for the method is working
  @Test
  public void testPalindromeNumber() {
    Palindrome test = new Palindrome();
    int input = 121;

    assertTrue("if the Palindrome method return the expected output",
        test.palindrome(input) == true);
  }
}
