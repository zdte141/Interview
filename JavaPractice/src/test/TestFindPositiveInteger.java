package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.FindpositiveInteger;

public class TestFindPositiveInteger {
  // test if there is corresponding class exist.
  @Before
  public void testClass() {
    FindpositiveInteger test = new FindpositiveInteger();
  }

  // test case to find the find first missing positive integer.
  @Test
  public void testFindPositiveInteger() {
    FindpositiveInteger test = new FindpositiveInteger();
    int[] input = {3, 4, -1, 1};
    int output = 2;

    assertTrue("Find the First Positive integer", test.findPositiveInteger(input) == output);
  }

}
