package interviewQuestions;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in order.
 * 
 * @author sanghunlee
 *
 */
public class InsertPosition {

  public int insertPosition(int[] input, int target) {
    /**
     * for loop to iterate through and check for the integer count that correspond to target integer
     * in the array.
     */
    for (int i = 0; i < input.length; i++) {
      if (input[i] == target) {
        return i;
      }
    }
    // set the integer j = 0.
    int j = 0;
    // iterate through the arrays with int i.
    for (int i = 0; i < input.length; i++) {
      // check for the first and last integer in the input array to meet the condition.
      if (input[0] > target) {
        return 0;
      } else if (input[input.length - 1] < target) {
        j = i + 1;
        // stop the loop to finish the search.
        break;
      }
    }
    return j;
  }

}
