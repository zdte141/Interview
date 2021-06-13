package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.SingleNumber;

public class TestSingleNum {
  // test to check if there is class for SingleNumber.class.
  @Before
  public void testClass() {
    SingleNumber singleNumber = new SingleNumber();
  }

  /**
   * TDD test to check if the method singleNumber is correctly executing with it's condition.
   */
  @Test
  public void test() {
    SingleNumber test = new SingleNumber();
    int[] input = {2, 2, 1};
    int output = 1;

    assertTrue("TDD for SingleNumber method, check for the unique number",
        test.singleNumber(input) == output);
  }

}
