package TestRecursion;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import Recursion.SumDigits;

public class TestSumDigits {
  @Before
  public void testClass() {
    SumDigits sumDigits = new SumDigits();
  }

  @Test
  public void testSumDigits() {
    SumDigits test = new SumDigits();

    int n = 126;
    int result = 9;
    assertTrue("method sumDigit must return the sum of all digits", test.sumDigits(n) == result);
  }

}
