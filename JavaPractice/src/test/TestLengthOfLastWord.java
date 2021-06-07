package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.LengthOfLastWord;

public class TestLengthOfLastWord {
  // test to check for the class.
  @Before
  public void testClass() {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
  }

  // test case made to drive the TDD.
  @Test
  public void test() {
    LengthOfLastWord test = new LengthOfLastWord();
    String input = "Hello World";
    int result = 5;

    assertTrue("Count the number of Char in the last word in the String",
        test.lengthOfLastWord(input) == result);
  }

}
