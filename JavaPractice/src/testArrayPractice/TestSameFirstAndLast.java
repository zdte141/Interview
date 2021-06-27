package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.SameFirstAndLast;

public class TestSameFirstAndLast {
  // test if the corresponding class exist.
  @Before
  public void testClass() {
    SameFirstAndLast sameFirstAndLast = new SameFirstAndLast();
  }

  // TDD method to check if the sameFirstAndLast working.
  @Test
  public void testSameFirstAndLast() {
    SameFirstAndLast test = new SameFirstAndLast();
    int[] input = {1, 2, 3, 1};

    assertTrue(
        "if the input contains same integer in first and last index of the array return true",
        test.sameFirstAndLast(input) == true);
  }

}
