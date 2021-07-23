package ArrayPractice;

/**
 * We'll say that an element in an array is "alone" if there are values before and after it, and
 * those values are different from it. Return a version of the given array where every instance of
 * the given value which is alone is replaced by whichever value to its left or right is larger.
 * 
 * 
 * @author sanghunlee
 *
 */
public class NotAlone {
  /**
   * method notAlone is to replace integer alone to biggest neighbours value if int alone is
   * surrounded by both side.
   * 
   * @param nums of integer arrays.
   * @param alone integer to replace.
   * @return new integer arrays with replaced values.
   */
  public int[] notAlone(int[] nums, int alone) {
    // use for loop to iterate through the array nums.
    for (int i = 0; i < nums.length - 1; i++) {
      // condition if at index i meets the integer alone.
      if (nums[i] == alone) {
        // check which neighbour integer is bigger value.
        if (nums[i + 1] > nums[i - 1]) {
          // replace the interger at alone to bigger neighbour
          nums[i] = nums[i + 1];
        } else {
          nums[i] = nums[i - 1];
        }
      }
    }
    for (int input : nums) {
      System.out.println(input);
    }
    // return the new arrays of integer.
    return nums;
  }

}
