package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * only return the sum of two arrays if the a is length of 2 and b is length of 2 to return legnth
 * of 4 array.
 * 
 * @author sanghunlee
 *
 */
public class PlusTwo {
  /**
   * method plusTwo to add up two arrays a and b to return the new arrays with length of 4.
   * 
   * @param a integer of arrays a.
   * @param b integer of arrays b.
   * @return the arrayList of integers.
   */
  public List<Integer> plusTwo(int[] a, int[] b) {
    // create the new arrayList to simply store the values of a and b.
    List<Integer> result = new ArrayList<>();
    // when it meets the condition if a and b length are 2 to add up to make 4 elements containing
    // in the array.
    if (a.length == 2 && b.length == 2) {
      // for each loop to store the values in the arrayList.
      for (int nums : a) {
        result.add(nums);
      }
      // for each loop to store the values in the arrayList to make length of 4.
      for (int nums2 : b) {
        result.add(nums2);
      }
    } // use of for loop to iterate through the result to check the
    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));
    }
    // return the arrayList.
    return result;
  }

}
