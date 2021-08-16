package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.RichCus;

public class TestRichCus {
  @Before
  public void testClass() {
    RichCus richCus = new RichCus();
  }

  @Test
  public void testRichCus() {
    RichCus test = new RichCus();

    int[][] account = {{1, 2, 3}, {3, 2, 1}};

    int output = 6;

    assertTrue("check the method returns the correct values", test.richCus(account) == output);
  }

}
