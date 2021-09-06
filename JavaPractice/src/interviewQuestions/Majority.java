package interviewQuestions;

/**
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the
 * majority element always exists in the array.
 * 
 * @author sanghunlee
 *
 */
public class Majority {

  public int majorityElement(int[] nums) {
    int majorityCount = nums.length / 2;

    for (int num : nums) {
      int count = 0;

      for (int element : nums) {
        if (element == num) {
          count++;
        }
      }
      if (count > majorityCount) {
        return num;
      }
    }
    return -1;
  }

}
