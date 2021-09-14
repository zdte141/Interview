package test;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.Diagonal;

public class TestDiagonalSum {
  @Before
  public void testClass() {
    Diagonal diagonal = new Diagonal();
  }

  @Test
  public void testDiagonalSum() {
    Diagonal test = new Diagonal();

    List<List<Integer>> arr = new ArrayList<List<Integer>>();

    List<Integer> a1 = new ArrayList<Integer>();
    a1.add(11);
    a1.add(2);
    a1.add(4);
    arr.add(a1);

    List<Integer> a2 = new ArrayList<Integer>();
    a2.add(4);
    a2.add(5);
    a2.add(6);
    arr.add(a2);

    List<Integer> a3 = new ArrayList<Integer>();
    a3.add(10);
    a3.add(8);
    a3.add(-12);
    arr.add(a3);

    int output = 15;

    assertTrue("check for the diagonal sum is completed sucessfully",
        test.diagonalSum(arr) == output);

  }

}
