package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.SquareUp;

public class TestSquareUp {
  // TDD to check if there is a corresponding class SquareUp.java exist.
  @Before
  public void testClass() {
    SquareUp squareUp = new SquareUp();
  }

  // TDD to check if the method correctly implement the values with method squareUp().
  @Test
  public void testSquareUp() {
    SquareUp test = new SquareUp();

    int n = 3;
    int[] nums = {0, 0, 1, 0, 2, 1, 3, 2, 1};

    assertTrue("create an array length n * n with the following pattern with squareUp method",
        Arrays.equals(test.squareUp(n), nums));
  }

}
