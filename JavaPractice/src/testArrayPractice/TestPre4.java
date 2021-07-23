package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.Pre4;

public class TestPre4 {
  @Before
  public void testClass() {
    Pre4 pre4 = new Pre4();
  }

  @Test
  public void testPre4() {
    Pre4 test = new Pre4();

    int[] nums = {1, 2, 4, 1};
    int[] result = {1, 2};

    assertTrue("check if the method Pre4 removes all elements in the array after the element 4",
        Arrays.equals(test.pre4(nums), result));

  }

}
