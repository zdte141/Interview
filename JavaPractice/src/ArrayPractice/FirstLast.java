package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of ints, return true if 6 appears as either the first or last element in the
 * array. The array will be length 1 or more.
 * 
 * @author sanghunlee
 *
 */
public class FirstLast {
  /**
   * method firstLast to return the boolean value if the method return the expected value.
   * 
   * @param input of integer list
   * @return the boolean value only if the list input contains the 6 front or last index of the
   *         list.
   */
  public boolean firstLast(int[] input) {
    // create the new arrayList to store the values.
    List<Integer> test = new ArrayList<>();
    // if the input is empty then return false since there is no number to test.
    if (input == null) {
      return false;
    }
    // iterate through the array and add the numbers in the Arraylist test.
    for (int nums : input) {
      test.add(nums);
    }
    // Make the condition for the boolean value, only if number 6 contains front or last index of
    // the arrayList return true.
    if (test.get(0) == 6 || test.get(test.size() - 1) == 6) {
      return true;
    }
    // if condition does not meet then return the false.
    return false;
  }

}
