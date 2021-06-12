package interviewQuestions;

/**
 * 
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to
 * the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of the list, and each
 * element in the array contains a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * 
 * @author sanghunlee
 *
 */
public class PlusOne {
  /**
   * method plus one, to increment integer in last index of array by 1.
   * 
   * @param input of the integer array.
   * @return new integer array.
   */
  public int[] plusOne(int[] input) {
    // set int n as the size of the array input.
    int n = input.length;
    // for loop to iterate through input array from the last index of the array to beginning.
    for (int i = n - 1; i >= 0; i--) {
      // constrains 0 <= digits[i] <= 9
      if (input[i] != 9) {
        // increament the input at index i by 1.
        input[i]++;
        // once it increment then break to finish the loop.
        break;
      } else {
        input[i] = 0;
      }
    }
    // if the array size is 0 and it's value is 0 then return 1.
    if (input[0] == 0) {
      int[] res = new int[n + 1];
      res[0] = 1;
      return res;
    }
    return input;

  }

}
