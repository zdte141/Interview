package ArrayPractice;

public class Sum13 {
  /**
   * method sum13 is to add up all the intger in the arrays nums, until it reaches the number 13.
   * 
   * @param nums is arrays of integer.
   * @return total sum of numbers.
   */
  public int sum13(int[] nums) {
    // condition : if the array is empty then return 0.
    if (nums.length == 0) {
      return 0;
    }
    // intialise both count and sum integer to store the value.
    int count = 0;
    int sum = 0;
    // use of for loop to iterate through and add up count, if element 13 is found than stop the
    // loop.
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 13) {
        count++;
      } else {
        break;
      }
    }
    // use of another for loop to iterate through and sum of all elements in the array.
    for (int j = 0; j < count; j++) {
      sum += nums[j];
    }
    // return the sum of all elements until it reaches to 13.
    return sum;
  }

}
