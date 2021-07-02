package ArrayPractice;

public class MaxEnd3 {
  /**
   * method maxEnd3 to compare the elements in the Arrays to find the max elements in the arrays.
   * 
   * @param nums of integer of arrays.
   * @return return the new integer of arrays with all maxmimun numbers.
   */
  public int[] maxEnd3(int[] nums) {
    // first make the integer of array with same elements and size.
    int[] result = nums.clone();
    // initialise the int max.
    int max = 0;
    // use of for loop to iterate through the arrays in the int [] nums and compare the elements
    // using Math.max.
    for (int i = 0; i < nums.length - 1; i++) {
      /*
       * if(nums[i] > nums[i + 1]) { result[i] = nums[i]; result[i + 1] = nums[i]; }else{ result[i]
       * = nums[i+1]; result[i + 1] = nums[i+1]; }
       */
      // set the max as maximum values.
      max = Math.max(nums[i], nums[i + 1]);
    }
    // iterate through the for loop again and set all elements in the result as the int max.
    for (int j = 0; j < result.length; j++) {
      result[j] = max;
    }
    // return the array integer result.
    return result;
  }
}


