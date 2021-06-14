package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.ClimbingStairs;

/**
 * TDD class for the ClimbingStairs.java.
 * 
 * @author sanghunlee
 *
 */
public class TestClimbingStair {
  // test method to check for the corresponding class exist.
  @Before
  public void testClass() {
    ClimbingStairs climbingStairs = new ClimbingStairs();
  }

  // test method using TDD to compare the expected and actual result.
  @Test
  public void testClimbStairs() {
    ClimbingStairs test = new ClimbingStairs();
    int input = 2;
    int output = 2;

    assertTrue("check for the correct n steps to reach the roof",
        test.climbingStairs(input) == output);
  }

}
