package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that
 * single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * 
 * @author sanghunlee
 *
 */
public class SingleNumber {
  /**
   * method sinleNumber to print out the only unique number in the array list.
   * 
   * @param input integer array.
   * @return only unique integer in the array list.
   */
  public int singleNumber(int[] input) {
    // create the new List of arrayList to get the single Number.
    List<Integer> no_duplicate_list = new ArrayList<>();
    // if the input integer is empty then return 0.
    if (input.length == 0) {
      return 0;
    }
    // for each loop to iterate through the array.
    for (int i : input) {
      // if the no_duplicate_list does not contains the current integer in index i in input.
      if (!no_duplicate_list.contains(input)) {
        // then add the integer in the no_duplicate_list array.
        no_duplicate_list.add(i);
        // if the no_duplicate_list already contains the integer then remove that element in array.
      } else {
        no_duplicate_list.remove(new Integer(i));
      }
    }
    // return only left unqiue number.
    return no_duplicate_list.get(0);
  }


}
