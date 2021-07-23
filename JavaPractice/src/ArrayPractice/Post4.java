package ArrayPractice;

/**
 * Given a non-empty array of ints, return a new array containing the elements from the original
 * array that come after the last 4 in the original array. The original array will contain at least
 * one 4. Note that it is valid in java to create an array of length 0.
 * 
 * 
 * @author sanghunlee
 *
 */
public class Post4 {
  /**
   * method post4 to return the all elements in the array at lastest index where the 4 is found
   * 
   * @param nums integer arrays.
   * @return new integer arrays with modified value.
   */
  public int[] post4(int[] nums) {
    // to find the index initialise the count with length of nums arrays.
    int count = nums.length;
    // iterate through using for loop and find where the latest 4 is found.
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == 4) {
        break;
      }
      count--;
    }
    System.out.println("index where the 4 is placed : " + count);
    // make the new empty array with the length length of nums - count.
    int[] test = new int[nums.length - count];
    // use for loop to initialise the values into the test in correct order .
    for (int j = count; j < nums.length; j++) {
      test[j - count] = nums[j];
    }
    // print out the arrays to check.
    for (int k = 0; k < test.length; k++) {
      System.out.println(test[k]);
    }
    // return the new arrays.
    return test;
  }


}
