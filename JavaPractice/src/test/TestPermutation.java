package test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Permutation;

// Test class to run the TDD for Permutation.java
public class TestPermutation {
  // Before run the any test check if there is corresponding class exist in the package.
  @Before
  public void testClass() {
    Permutation permutation = new Permutation();

  }

  // TDD to run the test for the method permutation.
  @Test
  public void testPermutation() {
    // Check fo the class Permutation.
    Permutation test = new Permutation();
    // integer array input nums.
    int[] nums = {0, 2, 1, 5, 3, 4};
    // value output integer arrays.
    int[] output = {0, 1, 2, 4, 5, 3};
    // JUnit testing to check if the expected output match with input with the method.
    assertTrue("method permutation give out the correct output",
        Arrays.equals(test.permutation(nums), output));
  }

}
