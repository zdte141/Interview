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

  public boolean palindrome(int input) {
    if (input < 0 || (input % 10 == 0 && input != 0)) {
      return false;
    }

    int reverseNum = 0;
    while (input > reverseNum) {
      reverseNum = reverseNum * 10 + input % 10;
      input = input / 10;
    }

    return input == reverseNum || input == reverseNum / 10;
  }

}
