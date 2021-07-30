package ArrayPractice;

/**
 * 
 * Return a version of the given array where each zero value in the array is replaced by the largest
 * odd value to the right of the zero in the array. If there is no odd value to the right of the
 * zero, leave the zero as a zero.
 * 
 * 
 * @author sanghunlee
 *
 */
public class ZeroMax {
  /**
   * method zeroMax to replace the zero into maximum value only if it's odd value.
   * 
   * @param nums integer of arrays.
   * @return new repalced numbers of integer arrays.
   */
  public int[] zeroMax(int[] nums) {
    // initalise the integer value called max.
    int max = 0;
    // use of for loop to iterate through from the backwards and find whether the number is odd or
    // even number.
    for (int i = nums.length - 1; i >= 0; i--) {
      // if it's odd number than set max number.
      if (nums[i] % 2 != 0) {
        max = Math.max(max, nums[i]);
      }
      // if the current element in the arrays index is 0 then replace as max number.
      if (nums[i] == 0) {
        nums[i] = max;
      }
    }

    return nums;
  }

}
