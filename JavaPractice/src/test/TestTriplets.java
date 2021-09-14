package test;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Triplet;

public class TestTriplets {
  @Before
  public void testClass() {
    Triplet triplet = new Triplet();

  }

  @Test
  public void testTriplet() {
    Triplet test = new Triplet();

    List<Long> ar = new ArrayList<Long>();

    ar.add(1000000001L);
    ar.add(1000000002L);
    ar.add(1000000003L);
    ar.add(1000000004L);
    ar.add(1000000005L);

    long output = 5000000015L;

    assertTrue("check the sum of the integer become the long in the arrays",
        test.triplet(ar) == output);


  }

}
