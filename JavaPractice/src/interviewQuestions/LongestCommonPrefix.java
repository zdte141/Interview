package interviewQuestions;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * @author sanghunlee
 *
 */
public class LongestCommonPrefix {
  /**
   * method commonPrefix to find the longest common prefix.
   * 
   * @param input of string array.
   * @return the common prefix.
   */
  public Object commonPrefix(String[] input) {
    // if the string input is empty(0) then return the empty string.
    if (input.length == 0) {
      return "";
    }
    // Initialise the location of prefix at start of the array.
    String prefix = input[0];
    // use for loop to iterate through the string in array.
    for (int i = 1; i < input.length; i++) {
      // while there is common prefix in the index of string
      while (input[i].indexOf(prefix) != 0) {
        // re set the prefix within common string.
        prefix = prefix.substring(0, prefix.length() - 1);
        // if the prefix is empty then return empty string.
        if (prefix.isEmpty()) {
          return "";
        }
      }
    }
    return prefix;
  }

}
