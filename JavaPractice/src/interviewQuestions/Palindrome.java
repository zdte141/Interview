package interviewQuestions;

/**
 * Given an integer x, return true if x is palindrome integer.
 * 
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is
 * palindrome while 123 is not.
 * 
 * @author sanghunlee
 *
 */
public class Palindrome {
  /**
   * method palindrome to revert the integer and checks for the correct boolean result.
   * 
   * @param input of the integer
   * @return the boolean true or false.
   */
  public boolean palindrome(int input) {
    // if the input is less than 0 it's not palidrome number.
    // to be palindrome number first and last digit of the number have to be 0.
    // example 020.
    if (input < 0 || (input % 10 == 0 && input != 0)) {
      return false;
    }
    // implemented method from the reverseInteger, set the inital integer value by 0.
    // if the input is bigger than the initial value, which means not all number been reversed.
    // reverse number is being reverted until it reverse it's value.
    int reverseNum = 0;
    while (input > reverseNum) {
      reverseNum = reverseNum * 10 + input % 10;
      input = input / 10;
    }
    // return true only if the reversed value is same to the input value.
    return input == reverseNum || input == reverseNum / 10;
  }

}
