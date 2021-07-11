package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.PlusTwo;

/**
 * Test class to run the test driven development.
 * 
 * @author sanghunlee
 *
 */
public class TestPlusTwo {
  // TDD to check the class PlusTwo.java exist.
  @Before
  public void testClass() {
    PlusTwo plusTwo = new PlusTwo();
  }

  // TDD to check if the sum of two array returns the whole values of a and b are length of 2.
  @Test
  public void testPlustTwo() {
    PlusTwo test = new PlusTwo();

    int[] a = {1, 2};
    int[] b = {3, 4};

    List<Integer> result = new ArrayList<>();
    result.add(1);
    result.add(2);
    result.add(3);
    result.add(4);
    assertTrue("check if the two arrays are combined together", test.plusTwo(a, b).equals(result));
  }

}
