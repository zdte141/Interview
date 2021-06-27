package testArrayPractice;


import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import ArrayPractice.FirstLast;

public class FirstLast6 {
  // test if the corresponding class exist.
  @Before
  public void testClass() {
    FirstLast firstLast = new FirstLast();
  }

  // TDD for the method firstLast.
  @Test
  public void testFirstLast() {

    FirstLast test = new FirstLast();
    // list of integer input
    int[] input = {1, 2, 6};
    // checking the method firstLast actually working.
    assertTrue("check if the number 6 place first or last index in the array",
        test.firstLast(input) == true);
  }

}
