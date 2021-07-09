package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Start1;

public class TestStart1 {

  @Before
  public void testClass() {
    Start1 start1 = new Start1();
  }

  @Test
  public void test() {
    Start1 test = new Start1();

    int[] a = {1, 2, 3};
    int[] b = {1, 3};

    int result = 2;

    assertTrue("check how many number 1 is appearing in both arrays", test.start1(a, b) == result);
  }

}
