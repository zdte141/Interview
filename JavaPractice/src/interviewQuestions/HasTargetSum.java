package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17. Bonus: Can you do
 * this in one pass?
 * 
 * @author sanghunlee
 *
 */

public class HasTargetSum {

  public boolean targetSum(int[] input, int target) {
    // make the empty arraylist to store the value to compare for the boolean value.
    List<Integer> test = new ArrayList<>();
    // if the input list is empty then return false.
    if (input == null) {
      return false;
    }
    // iterate through the list of input by num,
    for (int num : input) {
      // if the input array contains the target - num
      if (test.contains(target - num)) {
        // return the true.
        return true;
      }
      // add store the num currently in the array.
      test.add(num);
    }
    return false;
  }

}
