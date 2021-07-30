package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.ZeroFront;

public class TestZeroFront {
  @Before
  public void testClass() {
    ZeroFront zeroFront = new ZeroFront();
  }

  @Test
  public void testZeroFront() {
    ZeroFront test = new ZeroFront();

    int[] nums = {0, 1, 1, 0, 1};
    int[] result = {0, 0, 1, 1, 1};
    Map<Integer, Integer> output = new HashMap<Integer, Integer>();
    output.put(0, 0);
    output.put(3, 0);
    output.put(1, 1);
    output.put(2, 1);
    output.put(4, 1);

    assertTrue("check if the method zeroFront modifited nums into result",
        test.zeroFront(nums).equals(output));
  }

}
