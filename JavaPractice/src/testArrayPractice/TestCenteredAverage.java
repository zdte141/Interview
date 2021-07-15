package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.CenteredAverage;

/**
 * TDD class TestCenteredAverage.java to make the test case and run the TDD.
 * 
 * @author sanghunlee
 *
 */
public class TestCenteredAverage {
  // TDD to make sure the class CenteredAverage exist to implement the method.
  @Before
  public void testClass() {
    CenteredAverage centeredAverage = new CenteredAverage();
  }

  // TDD to construct the test and run the method centeredAverage with expected result to find out
  // method is working.
  @Test
  public void testCenteredAverage() {
    CenteredAverage test = new CenteredAverage();

    int[] nums = {1, 2, 3, 4, 100};

    int result = 3;
    System.out.println("TEST CASE 1 : ");
    assertTrue(
        "check if the method centeredAverage return the average number except the largest and smallest values",
        test.centeredAverage(nums) == result);
  }

  // TDD to check again in different case.
  @Test
  public void testAgain() {
    CenteredAverage test = new CenteredAverage();

    int[] nums = {1, 2, 5, 5, 10, 8, 7};

    int result = 5;
    System.out.println("TEST CASE 2 : ");
    assertTrue("check again", test.centeredAverage(nums) == result);
  }

}
