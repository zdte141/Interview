package ArrayPractice;

public class MaxSpan {
  /**
   * method maxSpan to check the leftmost and rightmost number is not counted.
   * 
   * @param nums arrays of integers.
   * @return only span of the numbers.
   */
  public int maxSpan(int[] nums) {
    // set int count as 1 to start counting the number from the 1.
    int count = 1;
    // if the array has the only one element then return the 1.
    if (nums.length == 1) {
      return 1;
    } else {
      // set the for loop condition to not count the leftmost and rightmost element.
      for (int i = 1; i < nums.length - 1; i++) {
        // use of count increment.
        count++;
      }
      // return the total count numbers of elements between leftmost and rightmost integer in the
      // array.
      return count;
    }
  }

}
