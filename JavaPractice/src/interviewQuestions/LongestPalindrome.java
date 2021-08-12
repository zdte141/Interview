package interviewQuestions;

/**
 * Given a string s, return the longest palindromic substring in s.
 * 
 * @author sanghunlee
 *
 */
public class LongestPalindrome {

  public String longestPalindrome(String s) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = s.length() - 1; i > 0; i--) {
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          stringBuilder.append(s.substring(j, i));
        }
      }
    }
    return stringBuilder.toString();

  }

}
