package ArrayPractice;

/**
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 * 
 * 
 * @author sanghunlee
 *
 */
public class No23 {
  /**
   * make boolean condition if the input values don't have 2 or 3 to return true;
   * 
   * @param input length of 2 arrays.
   * @return only true if the array does not contains 2 or 3.
   */
  public boolean no23(int[] input) {
    if (input[0] == 2 || input[0] == 3 || input[1] == 2 || input[1] == 3) {
      return false;
    } else {
      return true;
    }
  }

}
