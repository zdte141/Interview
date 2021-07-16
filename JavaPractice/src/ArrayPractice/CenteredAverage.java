package ArrayPractice;

/**
 * 
 * Return the "centered" average of an array of ints, which we'll say is the mean average of the
 * values, except ignoring the largest and smallest values in the array. If there are multiple
 * copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int
 * division to produce the final average. You may assume that the array is length 3 or more.
 * 
 * @author sanghunlee
 *
 */
public class CenteredAverage {
  /**
   * method centeredAverage to return the mean of number except the min and max integer in the
   * arrays.
   * 
   * @param nums integer arrays
   * @return the mean of value.
   */
  public int centeredAverage(int[] nums) {
    // Initalise the min to store and find the minimum value.
    int min = nums[0];
    // initialise the max to store and find the maximum value.
    int max = nums[0];
    // Initialise the total num to find the sum of all integer in the array.
    int totalNum = 0;
    // Initialise the average to find the average mean value.
    int average;
    // count to count the how many integer in the array.
    int count = 0;
    // if the length of the array is less than 3 then it's fail case.
    if (nums.length < 3) {
      return 0;
    } else {
      // use of single for - loop to iterate through and collect all the essential components.
      for (int i = 0; i < nums.length; i++) {
        // compare and find the max number by Math.max method.
        max = Math.max(nums[i], max);
        // compare and find the min number by Math.min method.
        min = Math.min(nums[i], min);
        // find the total sum of all integer in the array.
        totalNum += nums[i];
        // increment the count of the array.
        count++;
      }
      /*
       * for (int j = 0; j < nums.length; j++) { totalNum += nums[j]; count++; }
       */
      // print out the total sum of number.
      System.out.println("This is total sum of all element in the integer array " + totalNum);
      // print out the maximum number.
      System.out.println("this is max number " + max);
      // print out the mimimum number.
      System.out.println("This is min number " + min);
      // calculate the average centeredAverage number.
      average = (totalNum - (max + min)) / (count - 2);
    }
    // print out the average centred number.
    System.out.println("this is centeredAverage Number " + average);
    // return the final result.
    return average;
  }

}
