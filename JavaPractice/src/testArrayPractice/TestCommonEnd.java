package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.CommonEnd;

public class TestCommonEnd {
  // test class to check for the corresponding class of CommonEnd

  @Before
  public void testClass() {
    CommonEnd commonEnd = new CommonEnd();
  }

  // TDD to check for if the a and b are having commonEnd integer value.
  @Test
  public void testCommonEnd() {
    CommonEnd test = new CommonEnd();
    int[] a = {1, 2, 3};
    int[] b = {7, 3};

    assertTrue("if the two array have the same commonEnd return true",
        test.commonEnd(a, b) == true);

  }

}
