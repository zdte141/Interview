package ArrayPractice;

public class BigDiff {
  /**
   * method bigDiff to identify the max and min number of the nums array and find the difference.
   * 
   * @param nums arrays of integer
   * @return the difference of the integer.
   */
  public int bigDiff(int[] nums) {
    int min = nums[0];
    int max = nums[0];

    for (int i = 0; i < nums.length; i++) {
      min = Math.min(min, nums[i]);
      max = Math.max(max, nums[i]);
    }
    int diff = max - min;
    System.out.println(diff);
    return diff;
  }

}
