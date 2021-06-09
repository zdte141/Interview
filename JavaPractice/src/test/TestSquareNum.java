package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.SquareNum;

/**
 * test class to drive TDD with square number.
 * 
 * @author sanghunlee
 *
 */
public class TestSquareNum {
  // Before the actual test case, this is to check whether there is an class.
  @Before
  public void testClass() {
    SquareNum squareNum = new SquareNum();
  }

  // test case to check integer implement is power it's base number.
  @Test
  public void test() {
    SquareNum test = new SquareNum();
    int baseNum = 2;
    int power = 3;
    int output = 8;

    assertTrue("test of the powerNum withoutUsing Maths.function",
        test.squareNum(baseNum, power) == output);

  }

}
