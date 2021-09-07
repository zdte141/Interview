package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.HappyNumber;

public class TestHappyNumber {
  @Before
  public void testClass() {
    HappyNumber happyNumber = new HappyNumber();
  }

  @Test
  public void testHappyNumber() {
    HappyNumber test = new HappyNumber();

    int n = 19;


    assertTrue("return true only if the method happyNumber return the expected output",
        test.isHappy(n) == true);
  }

}
