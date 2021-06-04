package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.SortArray;

public class TestSortArray {

  @Before
  public void testClass() {
    SortArray sortArray = new SortArray();
  }

  @Test
  public void testRemoveSortArray() {
    SortArray test = new SortArray();
    int[] nums = {1, 1, 2};
    int[] result = {1, 2};

    assertTrue("check for if the duplicate integer in array been removed",
        test.removeSortArray(nums) == 2);

  }

}
