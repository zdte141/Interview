package testArrayPractice;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MakeEnds;

public class TestMakeEnds {
  // TDD to check the MakeEnds.java exist.
  @Before
  public void testClass() {
    // Construct the makeEnds class.
    MakeEnds makeEnds = new MakeEnds();
  }

  // TDD to run the makeEnds method to run correctly.
  @Test
  public void testMakeEnds() {
    MakeEnds test = new MakeEnds();

    int[] nums = {1, 2, 3};

    int[] result = {1, 3};

    assertTrue("check if the makeEnds methods give correct result",
        Arrays.equals(test.makeEnds(nums), result));
  }

}
