package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.EvenOdd;

public class TestEvenOdd {
  // TDD to check the class EvenOdd.java
  @Before
  public void testCLass() {
    EvenOdd evenOdd = new EvenOdd();
  }

  // TDD to check the method is working.
  @Test
  public void testEvenOdd() {
    EvenOdd test = new EvenOdd();

    int[] nums = {1, 0, 1, 0, 0, 1, 1};

    int[] result = {0, 0, 0, 1, 1, 1, 1};

    assertTrue("check if the evenOdd method is worked", Arrays.equals(test.evenOdd(nums), result));
  }

}
