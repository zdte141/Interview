package TestRecursion;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import Recursion.Factorial;

/**
 * TDD class to run the Recusion method in TDD environment
 * 
 * @author sanghunlee
 *
 */
public class TestFactorial {
  // TDD to check if the class Factorial.java exist.
  @Before
  public void testClass() {
    Factorial factorial = new Factorial();
  }

  // TDD to check Factorial correctly respond the call of it's method to process recursion process.
  @Test
  public void testFactorial() {
    Factorial test = new Factorial();

    int n = 3;
    int result = 6;

    assertTrue("Factorial of the n number is equal to result using facotrial method",
        test.factorial(n) == result);
  }

}
