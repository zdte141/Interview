package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.MaxMirror;

public class TestMaxMirror {
  @Before
  public void testClass() {
    MaxMirror maxMirror = new MaxMirror();
  }

  @Test
  public void testMaxMirror() {
    MaxMirror test = new MaxMirror();

    int nums[] = {1, 2, 3, 8, 9, 3, 2, 1,};

    int count = 3;

    assertTrue("method maxMirror to find out how many mirroring array input is found",
        test.maxMirror(nums) == count);
  }

}
