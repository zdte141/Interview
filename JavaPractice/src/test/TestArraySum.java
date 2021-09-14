package test;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.ArraySum;

public class TestArraySum {
  @Before
  public void testClass() {
    ArraySum arraySum = new ArraySum();
  }

  @Test
  public void testArraySum() {
    ArraySum test = new ArraySum();

    List<Integer> ar = new ArrayList<Integer>();
    ar.add(1);
    ar.add(2);
    ar.add(3);
    ar.add(4);
    ar.add(10);
    ar.add(11);
    int n = 31;

    assertTrue("check the arraySum return the correct sum of array with the index of n",
        test.arraySum(ar) == n);
  }

}
