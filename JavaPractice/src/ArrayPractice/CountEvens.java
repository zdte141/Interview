package ArrayPractice;

/**
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the
 * remainder, e.g. 5 % 2 is 1.
 * 
 * @author sanghunlee
 *
 */
public class CountEvens {
  /**
   * method countEvens to return the number of even integer count in the array.
   * 
   * @param nums integer of arrays.
   * @return the count of the even numbers.
   */
  public int countEvens(int[] nums) {
    // if the array is empty return 0.
    if (nums.length == 0) {
      return 0;
    }
    // set the count to increment the values when even values is found.
    int count = 0;
    // use of modulus and for loop to iterate through the arrays and increment count only if it's
    // even number
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }

}
