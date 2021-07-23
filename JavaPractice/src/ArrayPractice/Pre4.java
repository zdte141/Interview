package ArrayPractice;

public class Pre4 {
  /**
   * method pre4 to only return the new arrays until it find the element 4.
   * 
   * @param nums arrays of integer
   * @return new arrays with result values
   */
  public int[] pre4(int[] nums) {
    // if the 4 is found first index then return null.
    if (nums[0] == 4) {
      return null;
    }
    // initlaise the count.
    int count = 0;
    // use for loop to iterate through and find new index where is element 4 is
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        break;
      }
      count++;
    }
    // initialise the new int array with index size count.
    int[] result = new int[count];
    for (int j = 0; j < count; j++) {
      result[j] = nums[j];
    }
    return result;
  }

}
