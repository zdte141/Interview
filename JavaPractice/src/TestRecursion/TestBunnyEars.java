package TestRecursion;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import Recursion.BunnyEars;

public class TestBunnyEars {
  // TDD to check the class BunnyEars is correctly exist.
  @Before
  public void testClass() {
    BunnyEars bunnyEars = new BunnyEars();
  }

  // TDD to run the bunnyEars method to check the number of ears are correctly result from input
  // amount.
  @Test
  public void testBunnyEars() {
    BunnyEars test = new BunnyEars();

    int bunnies = 0;
    int result = 0;
    assertTrue("check if the bunny ears return correct amount", test.bunnyEars(bunnies) == result);
  }

  // try the again in different condition.
  @Test
  public void testAgain() {
    BunnyEars test = new BunnyEars();

    int bunnines = 3;
    int result = 6;

    assertTrue("check again correct amount of ears are returned",
        test.bunnyEars(bunnines) == result);
  }

}
