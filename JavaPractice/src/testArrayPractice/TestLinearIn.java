package testArrayPractice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.LinearIn;

public class TestLinearIn {
  // TDD to test whether LinearIn.java exist.
  @Before
  public void testClass() {
    LinearIn linearIn = new LinearIn();
  }

  // TDD to check if method linearIn works to return only true if all inner values exist in the
  // outer value.
  @Test
  public void testLinearIn() {
    LinearIn test = new LinearIn();
    int[] outer = {1, 2, 4, 6};
    int[] inner = {2, 4};

    assertTrue("if all the inner values are exist in the outer arrays return true",
        test.linearIn(outer, inner) == true);
  }

  // in fail condition that linearIn does not work
  @Test
  public void testAgain() {
    LinearIn test = new LinearIn();

    int[] outer = {1, 2, 4, 6};
    int[] inner = {2, 3, 4};

    assertFalse("check that when method is not working in wrong condition",
        test.linearIn(outer, inner) == true);
  }

  // another TDD to test if the method linearIn works
  @Test
  public void testAgain2() {
    LinearIn test = new LinearIn();
    int[] outer = {1, 2, 4, 4, 6};
    int[] inner = {2, 4};

    assertTrue("if all the inner values are exist in the outer arrays return true",
        test.linearIn(outer, inner) == true);
  }

}
