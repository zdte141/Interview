package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MaxTriple;

/**
 * TDD to run the test for the maxTriple method.
 * 
 * @author sanghunlee
 *
 */
public class TestMaxTriple {
  // TDD to check if the corresponding class MaxTriple exist.
  @Before
  public void testClass() {
    MaxTriple maxTriple = new MaxTriple();
  }


  // TDD to run the method maxTriple give out the result correctly.


  @Test
  public void testMaxTriple() {
    MaxTriple test = new MaxTriple();

    int[] nums = {1, 2, 3};
    int result = 3;
    assertTrue(
        "check for the method maxTriple result the max number in the triple integers in the arrays",

        test.maxTriple(nums) == result);
  }

  // another test case to make sure the maxTriple return the correct result in different condition
  @Test
  public void testMaxTripleAgain() {
    MaxTriple test = new MaxTriple();
    int[] a = {10, 5, 9, 11, 13, 8, 20, 9, 3};
    int result = 20;

    assertTrue("check if the method maxTriple give out correct answer",
        test.maxTriple(a) == result);

  }


}
