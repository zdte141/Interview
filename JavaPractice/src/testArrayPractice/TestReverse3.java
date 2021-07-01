package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Reverse3;

public class TestReverse3 {
  // TDD to check for the class.
  @Before
  public void testClass() {
    Reverse3 reverse = new Reverse3();
  }

  // TDD to check the reverse method working with the input values and expected output.
  @Test
  public void testReverse3() {
    Reverse3 test = new Reverse3();


    int[] input = {1, 2, 3};
    int[] output = {3, 2, 1};

    assertTrue("give back the boolean value only if input equal to output",
        Arrays.equals(test.reverse(input), output));
  }

}
