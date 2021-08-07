package testArrayPractice;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.CountCLumps;

public class TestCountClumps {
  @Before
  public void testCountClumps() {
    CountCLumps countClumps = new CountCLumps();
  }

  @Test
  public void testCountCLumps() {
    CountCLumps test = new CountCLumps();

    int[] a = {1, 2, 2, 3, 4, 4};
    int result = 2;
    assertTrue("count clumps will return series of 2 or more adjacent elements of the same value",
        test.countClumps(a) == result);

  }

}
