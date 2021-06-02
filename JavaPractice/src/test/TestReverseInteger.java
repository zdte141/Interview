package test;

import interviewQuestions.ReverseInteger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestReverseInteger {

  @Before
  public void testClass() {
    ReverseInteger reverseInteger = new ReverseInteger();

  }

  @Test
  public void testReverseInteger() {
    int input = 123;
    int output = 321;
    ReverseInteger test = new ReverseInteger();

    assertTrue("check for reverse of the integer is correct", test.reverse(input) == output);
  }

}
