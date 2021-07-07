package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TestMakeLast {
  // TDD to check for the right test case of MakeLast.java
  @Before
  public void testClass() {
    MakeLast makeLast = new MakeLast();
  }

  // TDD to check for the method is correctly working.
  @Test
  public void testMakeLast() {
    MakeLast test = new MakeLast();
    // make arrays with input integer.
    int[] input = {4, 5, 6};
    // make an arrayList with Integer variables.
    List<Integer> result = new ArrayList<Integer>();
    result.add(0);
    result.add(0);
    result.add(0);
    result.add(0);
    result.add(0);
    result.add(6);
    // assertTrue to check if the makeLast working well.
    assertTrue("check the result is double the length of the input arrays and has last element",
        test.makeLast(input).equals(result));
  }
}
