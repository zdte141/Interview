package ArrayPractice;

/**
 * Return an array that contains the exact same numbers as the given array, but rearranged so that
 * all the even numbers come before all the odd numbers. Other than that, the numbers can be in any
 * order. You may modify and return the given array, or make a new array.
 * 
 * @author sanghunlee
 *
 */
public class EvenOdd {
  /**
   * method evenOdd to repalce the location of the elements by even numbers come first and odd
   * numbers replace to the end
   * 
   * @param nums of integer arrays.
   * @return new arrays with re allocated elements.
   */
  public int[] evenOdd(int[] nums) {
    // count Even numbers.
    int countEven = 0;
    // count odd numbers.
    int countOdd = nums.length - 1;
    // set the new integer arrays with same size as nums arrays.
    int[] result = new int[nums.length];
    // for loop to iterate through the nums arrays .
    for (int i = 0; i < nums.length; i++) {
      // if the current index is even number.
      if (nums[i] % 2 == 0) {
        // index at the current even number is equal to current nums element.
        result[countEven] = nums[i];
        // increment the countEven to set in next element index
        countEven++;
      } else {
        // if it's not even number than set current element from nums [i] at the end of the result
        result[countOdd] = nums[i];
        // decrement the countOdd.
        countOdd--;
      }
    }
    // return the new result arrays
    return result;
  }

}
