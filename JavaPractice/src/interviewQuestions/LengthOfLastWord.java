package interviewQuestions;

/**
 * Given a string s consists of some words separated by spaces, return the length of the last word
 * in the string. If the last word does not exist, return 0.
 * 
 * 
 * @author sanghunlee
 *
 */
public class LengthOfLastWord {
  /**
   * method to split up the String and store as array then count the length of the last string index
   * in array.
   * 
   * @param input string input
   * @return integer count number of chars in the string.
   */
  public int lengthOfLastWord(String input) {
    String[] str = input.split("/n");
    if (str.length == 0) {
      return 0;
    } else {
      return str[str.length - 1].length();
    }
  }

}
