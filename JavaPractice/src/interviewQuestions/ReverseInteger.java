package interviewQuestions;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the
 * value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * 
 * @author sanghunlee
 *
 */
public class ReverseInteger {
  // Declare unchage result in static integer 0.
  static int result = 0;

  // method reverse(int input) to reverse the integer input.
  public int reverse(int input) {
    // check if the integer is value of 0 to return the result.
    if (input == 0) {
      return result;
    }
    /**
     * if the int is above 0, then make a temporary value where input % 10 to each last digit of
     * integer. Store the last digit in temp.
     * 
     */
    if (input > 0) {
      int temp = input % 10;
      // result will time by 10 for each time of result to reverse adding last digit of temp.
      result = result * 10 + temp;
      // recursive call of functions to reverse the remaining number.
      reverse(input / 10);
    }
    return result;
  }

}
