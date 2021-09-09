package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Atoi;

public class TestAtoi {
  @Before
  public void testClass() {
    Atoi atoi = new Atoi();
  }

  @Test
  public void testAtoi() {
    Atoi test = new Atoi();

    String s = "42";

    int output = 42;

    assertTrue("only correct if the string return the correct integer number",
        test.atoi(s) == output);
  }

  @Test
  public void testAtoi2() {
    Atoi test2 = new Atoi();

    String s = "   -42";

    int output = -42;

    assertTrue("check method correctly form into the integer removing the whitespace",
        test2.atoi(s) == output);
  }


}
