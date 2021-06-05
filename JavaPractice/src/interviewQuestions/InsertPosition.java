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
    for (int i = 0; i < input.length; i++) {
      if (input[i] == target) {
        return i;
      }
    }
    int j = 0;
    for (int i = 0; i < input.length; i++) {
      if (input[0] > target) {
        return 0;
      } else if (input[input.length - 1] < target) {
        j = i + 1;
        break;
      }
    }
    return j;
  }

}
