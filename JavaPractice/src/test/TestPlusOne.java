package test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.PlusOne;

// test case for the PlusOne.class.
public class TestPlusOne {
  // test to check if there is a PlusOne.class exist to execute.
  @Before
  public void testClass() {
    PlusOne plusOne = new PlusOne();
  }

  // test case to compare two arrays integers.
  @Test
  public void testPlusOne() {
    PlusOne test = new PlusOne();
    int[] input = {1, 2, 3};
    int[] output = {1, 2, 4};

    assertTrue("increment one to the integer", Arrays.equals(test.plusOne(input), output));
  }

}
