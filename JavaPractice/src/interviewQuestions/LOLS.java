package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class LOLS {

  public int lengthOfLongestSubstring(String input) {
    // set the integer i, j for the use of pointer.
    int i = 0, j = 0;
    // change the char array from string input value.
    char[] chars = input.toCharArray();
    // initalise the hashset.
    Set<Character> set = new HashSet<>();
    // set the max value as 0.
    int max = 0;
    // while j is less than the length of char from the set.
    while (j < chars.length) {
      // if the set has the value as index of j
      if (set.contains(chars[j])) {
        // remove the char at i.
        set.remove(chars[i++]);
      } else {
        // if the char does not contains in the set.
        set.add(chars[j++]);
        // find the max value where there is no duplicate values.
        max = Math.max(max, (j - i));
      }
    }
    // return the length of non duplicate values.
    return max;
  }

}
