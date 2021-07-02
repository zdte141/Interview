package ArrayPractice;

public class Sum2 {
  /**
   * method sum2 to run the method sum2 whether it gives correct sum of values. Given an array of
   * ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
   * just sum up the elements that exist, returning 0 if the array is length 0.
   * 
   * @param nums array of Integer input.
   * @return the integer values of sum of first 2 elements in the array.
   */
  public int sum2(int[] nums) {
    // make the condition if nums is empty then return 0.
    if (nums.length == 0) {
      return 0;
      // make the condition if nums elements are less then two return sum of whatever they have.
    } else if (nums.length < 2) {
      return nums[0] + nums[nums.length - 1];
      // return the sum of first two elements in the arrays
    } else {
      return nums[0] + nums[1];
    }

  }

}
