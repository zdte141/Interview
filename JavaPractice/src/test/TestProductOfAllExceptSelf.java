package test;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.ProductOfAllExceptSelf;

public class TestProductOfAllExceptSelf {
  @Before
  public void testClaas() {
    ProductOfAllExceptSelf test = new ProductOfAllExceptSelf();
  }

  @Test
  public void testPoroductOfAllExceptSelf() {
    ProductOfAllExceptSelf test = new ProductOfAllExceptSelf();

    int[] input = {1, 2, 3, 4, 5};
    int[] ouput = {120, 60, 40, 30, 24};

    assertTrue("check if the mulitple of arrays other and i number is correct",
        Arrays.equals(test.getProductArr(input), ouput));

  }

}
