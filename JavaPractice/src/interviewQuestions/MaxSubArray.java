package interviewQuestions;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which
 * has the largest sum and return its sum.
 * 
 * 
 * @author sanghunlee
 *
 */
public class MaxSubArray {

  public int maxSubArray(int[] input) {
    // set an integer with input array length.
    int n = input.length;
    // make an array with inject the integer number of input.length.
    int[] output = new int[n];
    // initialise integer maximum number at input of index 0 (first number in array).
    int max = input[0];
    // initialise output at 0 is equal to input at 0 index.
    output[0] = input[0];
    // use for loop to iterate through n number of time(length of input array).
    for (int i = 1; i < n; i++) {
      // find the maximum number from intput array at i or input with i and it's previous integer.
      output[i] = Math.max(input[i], input[i] + output[i - 1]);
      // compare to find the max number of sum array.
      max = Math.max(max, output[i]);
    }
    // return the sum of max number in the integer.
    return max;
  }

}
