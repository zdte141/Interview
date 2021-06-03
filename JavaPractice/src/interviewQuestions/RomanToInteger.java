package interviewQuestions;

/**
 * Algorithm to translate the Roman language input into the integer value.
 * 
 * @author sanghunlee
 *
 */
public class RomanToInteger {
  /**
   * method that will change Roman value into integer.
   * 
   * @param s String input of combinations of Roman value.
   * @return added value of all integer.
   */
  public int romanToInt(String s) {
    // if the input is null then return 0.
    if (s == null) {
      return 0;
    }
    // check for the Roman input length to see how many Roman word is in the input.
    int length = s.length();
    // set sum of number = 0.
    int sum = 0;
    // set the pre num = 0.
    int pre = 0;

    // use for loop to iterate through from the right most side of Roman word.
    for (int i = length - 1; i >= 0; i--) {
      // find the integer of value from the romanTable method at corresponding char(Roman) input.
      int cur = romanTable(s.charAt(i));
      // for right most case where i is equal to input length
      if (i == length - 1) {
        // set the sum = current integer value.
        sum = sum + cur;
      } else {
        // from next Roman number, if the right Roman word is bigger than left one
        if (cur < pre) {
          // then minus the sum value by current Roman integer value.
          sum = sum - cur;
        } else {
          // else then add the current Roman integer into sum of integer.
          sum = sum + cur;
        }
      }
      // set the pre number equal to current integer.
      pre = cur;
    }
    // return the total calculated integer number.
    return sum;
  }

  /**
   * Method to translate char value into the integer by using the switch statement.
   * 
   * @param c input value Char of c.
   * @return corresponding integer value depend of char.
   */
  public int romanTable(char c) {
    int number = 0;
    switch (c) {
      case 'I':
        number = 1;
        break;
      case 'V':
        number = 5;
        break;
      case 'X':
        number = 10;
        break;
      case 'L':
        number = 50;
        break;
      case 'C':
        number = 100;
        break;
      case 'D':
        number = 500;
        break;
      case 'M':
        number = 1000;
        break;
      default:
        number = 0;
        break;
    }
    return number;
  }



}
