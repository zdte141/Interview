package interviewQuestions;

/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
 * ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * 
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1
 * (inclusive).
 * 
 * 
 * @author sanghunlee
 *
 */
public class Permutation {
  /**
   * method permutation return the new array of integer with the values with index of each integer
   * values in the original array.
   * 
   * @param nums input integer.
   * @return output array integer with reallocating all elements.
   */
  public int[] permutation(int[] nums) {
    // to make the same size of the array find the length(size) of the original array.
    int length = nums.length;
    // make the empty array with same size.
    int[] result = new int[length];

    // use of for loop to iterate through index from 0, to result size.
    for (int i = 0; i < length; i++) {
      // re-allocate the result index with nums element values.
      result[i] = nums[nums[i]];
    }
    // return the new arrays.
    return result;
  }

}
