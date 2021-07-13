package ArrayPractice;

public class MiddleThree {
  /**
   * method middleThree to return the middle 3 elements in the nums array if the nums array length
   * is odd.
   * 
   * @param nums arrays of integer.
   * @return the result that contains the 3 elements of middle index.
   */
  public int[] middleThree(int[] nums) {
    // initalise the array of result with 3 indexes.
    int[] result = {0, 0, 0};
    // if the nums array length is odd.
    if (nums.length % 2 == 1) {
      // return the middle three result in set
      result[0] = nums[nums.length / 2 - 1];
      result[1] = nums[nums.length / 2];
      result[2] = nums[nums.length / 2 + 1];
    }
    // for loop to iterate through the result to print out all the result.
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }

    // return the result array.
    return result;
  }

}
