package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * 
 * 
 * @author sanghunlee
 *
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    // Use the Map to input the integer and corresponding value.
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      // use for loop to iterate through the arrays and find the difference of two nums.
      int diff = target - nums[i];
      // if the two following integers in the arrays difference is equal to diff
      if (map.containsKey(diff) && map.get(diff) != i) {
        // return the index of those two arrays in new updated arrays nums.
        return new int[] {i, map.get(diff)};
      }
    }
    throw new IllegalArgumentException("no Two sum solution");
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 10, 10, 15};
    int target = 9;

    TwoSum test = new TwoSum();
    test.twoSum(nums, target);

    for (int i : test.twoSum(nums, target)) {
      System.out.println(i);
    }
  }
}
