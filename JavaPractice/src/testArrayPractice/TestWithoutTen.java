package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.WithoutTen;

public class TestWithoutTen {
  @Before
  public void testClass() {
    WithoutTen withoutTen = new WithoutTen();

  }

  @Test
  public void testWithoutTen() {
    WithoutTen test = new WithoutTen();

    int[] nums = {1, 10, 10, 2};

    int[] result = {1, 2, 0, 0};

    assertTrue("check if the method withoutTen removes all element 10 and bring to forward",
        Arrays.equals(test.withoutTen(nums), result));
  }
}


