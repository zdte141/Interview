package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindpositiveInteger {

  public int findPositiveInteger(int[] input) {
    Set<Integer> set = new HashSet<>();
    int max = 0;

    for (int num : input) {
      set.add(num);
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
