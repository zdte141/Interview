package ArrayPractice;

public class Fix34 {
  /**
   * method that replace the elements to make the 4 follow by 3.
   * 
   * @param nums integer of arrays.
   * @return the new reallocated arrays nums.
   */
  public int[] fix34(int[] nums) {
    // use of for loop to iterate through the arrays.
    for (int i = 0; i < nums.length; i++) {
      // if the for loop find the nums element where it is 3.
      if (nums[i] == 3) {
        // use of another for loop to find the index where integer 4 exist in the arrays.
        for (int j = 0; j < nums.length; j++) {
          // identify the index where nums[j] == 4.
          if (nums[j] == 4) {
            // initialise the temperarly integer to store the value of where 4 will be replaced.
            int temp = nums[i + 1];
            // replace the element into 4 where i is 3.
            nums[i + 1] = 4;
            // replace the where it used to be 4 to temp value.
            nums[j] = temp;
          }
        }
      }
    }
    // return the re allocated arrays.
    return nums;
  }
}
