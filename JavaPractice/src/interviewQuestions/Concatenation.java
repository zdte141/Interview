package interviewQuestions;

public class Concatenation {
  /**
   * Given an integer array nums of length n, you want to create an array ans of length 2n where
   * ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
   * 
   * Specifically, ans is the concatenation of two nums arrays.
   * 
   * Return the array ans.
   * 
   * @param nums integer arrays.
   * @return double size of the original arrays with cloned input.
   */
  public int[] concatenate(int[] nums) {
    // int length to set the arrays with double the size.
    int length = nums.length * 2;
    // create the new arrays with the set length of double the original array.
    int[] result = new int[length];
    // int count to call for the index of original nums array.
    int count = 0;
    // use of for loop to iterate through the result arrays.
    for (int i = 0; i < result.length; i++) {
      // set at index of int i, call for element in count arrays
      result[i] = nums[count];
      // increment the count to get the next index of element in nums.
      count++;
      // if the count reach to the end of the arrays nums.
      if (count == 3) {
        // reset the count to implement the elements in the arrays again.
        count = 0;
      }
    }

    // print out the arrays to check.
    for (int j = 0; j < result.length; j++) {
      System.out.println(result[j]);
    }
    // return the result array.
    return result;
  }

}
