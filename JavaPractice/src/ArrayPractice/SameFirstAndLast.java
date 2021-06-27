package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an array of ints, return true if the array is length 1 or more, and the first element and
 * the last element are equal.
 * 
 * 
 * @author sanghunlee
 *
 */
public class SameFirstAndLast {
  /**
   * method sameFirstAndLast to check if the arraylist containst same integer in first and last
   * index of input list.
   * 
   * @param input of integer list.
   * @return true if the arraylist contains same number in first and last index of the arrayList.
   */
  public boolean sameFirstAndLast(int[] input) {
    // if the input is empty then return false.
    if (input == null) {
      return false;
    }
    // create the test arrayList to store the values in the input list.
    List<Integer> test = new ArrayList<>();
    // iterate through the for loop to store the value by method .add
    for (int nums : input) {
      test.add(nums);
    }
    // boolean condition to give true only if the array contains same integer in front and last
    // index of array.
    if (test.get(0) == test.get(test.size() - 1)) {
      return true;
    }
    // if the condition does not meet then return false.
    return false;
  }

}
