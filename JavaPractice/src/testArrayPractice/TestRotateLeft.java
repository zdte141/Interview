package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.RotateLeft;

public class TestRotateLeft {
  // TDD to check for the corresponding class.
  @Before
  public void testClass() {
    RotateLeft rotateLeft = new RotateLeft();
  }

  // TDD to test the method rotateLeft.
  @Test
  public void testRotateLeft() {
    // contructor to make test.
    RotateLeft test = new RotateLeft();
    // initialise the input in integer value.
    int[] input = {1, 2, 3};
    // create ArrayList with rotated values.
    List<Integer> result = new ArrayList<Integer>();
    result.add(2);
    result.add(3);
    result.add(1);
    // compare two Arrays by the object .equals.
    assertTrue("return true only if method is working", test.rotateLeft(input).equals(result));
  }

}
