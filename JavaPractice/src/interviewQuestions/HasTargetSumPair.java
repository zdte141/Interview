package interviewQuestions;

import java.util.HashSet;

/*
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class HasTargetSumPair {
  /**
   * Boolean method to check for the HasTargetSumPair is correct.
   * 
   * @param list of array of integers
   * @param target is the target integer of sum of two number from the list
   * @return boolean result whether it meets the condition.
   */
  public boolean hasTargetSumPair(int[] list, int target) {
    // HashSet is a collection of items where every item is unique.
    HashSet<Integer> set = new HashSet();
    for (int number : list) {
      // if the if statement meet the condition it will return true instead of add the number into
      // the set.
      if (set.contains(target - number)) {
        return true;
      }
      // if statement is not meeting the condition then the number is add to set.
      set.add(number);
    }
    return false;
  }

}
