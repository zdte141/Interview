package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.TenRun;

/**
 * TDD class to run the TenRun.
 * 
 * @author sanghunlee
 *
 */
public class TestTenRun {
  // TDD to check for the class TenRun.java exist.
  @Before
  public void testClass() {
    TenRun tenRun = new TenRun();
  }

  // First TDD case to run the method tenRun work by comparing the two integer arrays.
  @Test
  public void testTenRun() {
    TenRun test = new TenRun();

    int[] nums = {2, 10, 3, 4, 20, 5};

    int[] result = {2, 10, 10, 10, 20, 20};
    System.out.println("Test case 1 : ");
    assertTrue("check if two arrays after method is same",
        Arrays.equals(test.tenRun(nums), result));
  }

  // TDD second test case.
  @Test
  public void testAgain() {
    TenRun test2 = new TenRun();

    int[] nums = {10, 1, 20, 2};
    int[] result = {10, 10, 20, 20};
    System.out.println("Test case 2 : ");
    assertTrue("check again", Arrays.equals(test2.tenRun(nums), result));

  }

  // TDD third test case
  @Test
  public void testAagain2() {
    TenRun test3 = new TenRun();

    int[] nums = {10, 1, 9, 20};
    int[] result = {10, 10, 10, 20};
    System.out.println("Test case 3 : ");
    assertTrue("check again", Arrays.equals(test3.tenRun(nums), result));

  }

}


