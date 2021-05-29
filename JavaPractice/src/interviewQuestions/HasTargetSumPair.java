package interviewQuestions;

import java.util.HashSet;

/*
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class HasTargetSumPair {

  public boolean hasTargetSumPair(int[] list, int target) {

    HashSet<Integer> set = new HashSet();
    for (int number : list) {
      if (set.contains(target - number)) {
        return true;
      }
      set.add(number);
      System.out.println(set);
    }
    return false;
  }

}
