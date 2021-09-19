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

    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    a.add(5);
    a.add(6);
    a.add(7);

    b.add(3);
    b.add(6);
    b.add(10);

    List<Integer> output = new ArrayList<Integer>();
    output.add(1);
    output.add(1);
    assertTrue("compare the result", test.triplet(a, b).equals(output));
  }

}
