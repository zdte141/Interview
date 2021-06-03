package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.RomanToInteger;

public class TestRomanToInteger {

  /*
   * run the Test to confirm the class Roman exists.
   */
  @Before
  public void testRomanToInt() {
    RomanToInteger test = new RomanToInteger();
    String input = "X";
    int output = 10;
    assertTrue("if the correct shift happends from roman letter(String) to integer return true",
        test.romanToInt(input) == output);
  }

  @Test
  public void testSolution() {
    RomanToInteger test = new RomanToInteger();
    assertTrue("if Romand numerals are represent by seven different symbols",
        test.romanToInt("s") == 0);
  }

  @Test
  public void testRomanTable() {
    RomanToInteger test = new RomanToInteger();
    assertTrue("if the switch statement works correctly it will return the correct value",
        test.romanTable('X') == 10);
    assertFalse("if the switch statement doesn't work correctly it will return the false",
        test.romanTable('M') == 40);
  }

}
