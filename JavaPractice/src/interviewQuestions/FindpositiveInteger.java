package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindpositiveInteger {
  /**
   * set the HashSet of integer from the array to compare to find the first missing positive
   * integer.
   * 
   * @param input of array integer
   * @return of integer value.
   */
  public int findPositiveInteger(int[] input) {
    // set the hashSet of integer values.
    Set<Integer> set = new HashSet<>();
    // Initialise the max number of 0.
    int max = 0;
    // iterate through the array of integer from int[] input
    for (int num : input) {
      // input the integer in the arrays into the HashSet
      set.add(num);
      // find the maximum number by comparing the int max by current num in iteration.
      max = Math.max(max, num);
    }

    for (int i = 1; i <= max; i++) {
      if (!set.contains(i)) {
        return i;
      }
    }
    return max + 1;
  }

}
