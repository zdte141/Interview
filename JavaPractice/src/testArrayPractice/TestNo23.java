package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.No23;

public class TestNo23 {
  // TDD to check the class is No23.java.
  @Before
  public void testClass() {
    No23 no23 = new No23();
  }

  // TDD to check the method No23 is working.
  @Test
  public void testNo23() {
    No23 test = new No23();

    int[] input = {4, 5};

    assertTrue("check if the array does not contains 2 or 3", test.no23(input) == true);
  }

  // TDD to check the method No23 is not working.
  @Test
  public void testAgain() {
    No23 test = new No23();

    int[] input = {4, 2};
    assertTrue("check if the array does not contains 2 or 3", test.no23(input) == false);
  }

}
