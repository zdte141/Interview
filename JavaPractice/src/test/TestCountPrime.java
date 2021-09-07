package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.CountPrime;

public class TestCountPrime {
  @Before
  public void testClass() {
    CountPrime countPrime = new CountPrime();
  }

  @Test
  public void testCountPrime() {
    CountPrime test = new CountPrime();

    int n = 10;

    int output = 4;

    assertTrue("count the number of prime numbers less than non negative number n",
        test.countPrimes(n) == output);
  }

}
