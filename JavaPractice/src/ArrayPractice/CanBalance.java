package ArrayPractice;

public class CanBalance {
  /**
   * method canBalance will return the boolean value if it meets the condition when it have same sum
   * of values from each side of array.
   * 
   * @param nums integer of arrays.
   * @return the boolean value.
   */
  public boolean canBalance(int[] nums) {
    // initialise both side of sum values.
    int sumA = 0;
    int sumB = 0;
    // use of doubly for loop to sum of both side of arrays to find if there is point where they
    // have same sum of values.
    for (int i = 0; i < nums.length; i++) {
      sumA += nums[i];
      for (int j = nums.length - 1; j >= 0; j--) {
        sumB += nums[j];
        if (sumA == sumB) {
          return true;
        } else {
          return false;
        }
      }
    }
    // default boolean value is set to false.
    return false;
  }

}
