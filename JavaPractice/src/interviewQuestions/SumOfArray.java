package interviewQuestions;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * 
 * Return the running sum of nums.
 * 
 * @author sanghunlee
 *
 */
public class SumOfArray {
  /**
   * method SumOfArray is to give the result arrays with the combine of previous sum of array
   * values.
   * 
   * @param nums of integer arrays.
   * @return new integer arrays with the sum of previous values.
   */
  public int[] sumOfArray(int[] nums) {
    // set the length of nums to set the new arrays with same length.
    int length = nums.length;
    // initialise the new arrays with the same length.
    int[] ans = new int[length];
    // initialise the arrays at index 0 is equals to new arrays with index 0.
    ans[0] = nums[0];
    // use of for loop to iterate through the arrays.
    for (int i = 1; i < nums.length; i++) {
      // answer at index i is equals to sum of previous answer index and current num[i];
      ans[i] = ans[i - 1] + nums[i];

    }
    // for loop to print out the arrays values.
    for (int j = 0; j < ans.length; j++) {
      System.out.println(ans[j]);
    }
    // return the answer.
    return ans;
  }

}
