package ArrayPractice;

/**
 * Given an array of ints, swap the first and last elements in the array. Return the modified array.
 * The array length will be at least 1.
 * 
 * 
 * @author sanghunlee
 *
 */
public class SwapEnds {
  /**
   * swapEnds methods replace the first and the last of the integer in the arrays.
   * 
   * @param nums integer of arrays.
   * @return new arrays with swapped values.
   */
  public int[] swapEnds(int[] nums) {
    // clone the nums arrays with same length of arrays.
    int[] result = nums.clone();
    // if the nums is less than 1 elements
    if (nums.length <= 1) {
      // return the empty values.
      return null;
      // if the arrays has bigger than length of 1.
    } else {
      // swap the values first and last elements
      result[0] = nums[nums.length - 1];
      result[result.length - 1] = nums[0];
    } // use of for loop to iterate through the result of elements.
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
    // return the result;
    return result;
  }

}
