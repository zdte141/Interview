package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Post4;

/**
 * Class to run the TDD of Post4.java
 * 
 * @author sanghunlee
 *
 */
public class TestPost4 {
  // TDD to check if the class Post4.java exist.
  @Before
  public void testClass() {
    Post4 post4 = new Post4();
  }

  // TDD to check if the method return the correct array integer.
  @Test
  public void testPost4() {
    Post4 test = new Post4();

    int[] nums = {4, 1, 4, 2};

    int[] result = {2};
    System.out.println("First Test : ");
    assertTrue("check if the post4 method is returning elements after the element 4",
        Arrays.equals(test.post4(nums), result));
  }

  // Check again in different input value to check again.
  @Test
  public void testAgain() {
    Post4 test2 = new Post4();

    int[] nums = {4, 4, 1, 2, 3};

    int[] result = {1, 2, 3};
    System.out.println("Second test : ");
    assertTrue("check again", Arrays.equals(test2.post4(nums), result));
  }

  // check test 3 case.
  @Test
  public void testAgain2() {
    Post4 test3 = new Post4();

    int[] nums = {2, 4, 1, 2};
    int[] result = {1, 2};
    System.out.println("Third test : ");
    assertTrue("chceck again3", Arrays.equals(test3.post4(nums), result));
  }
}
