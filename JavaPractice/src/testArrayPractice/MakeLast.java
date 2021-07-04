package testArrayPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Give return of double size of the input arrays with last elements are the same.
 * 
 * @author sanghunlee
 *
 */
public class MakeLast {
  /**
   * method makeLast to build the arrayList that contains double of size of input array length with
   * 0 and last element same as last element in the input array.
   * 
   * @param input integer arrays.
   * @return the arrayList of Integer containing correct output.
   */
  public List<Integer> makeLast(int[] input) {
    // create the result list
    List<Integer> result = new ArrayList<Integer>();
    // use of for - each loop to doubly add into the ArrayList to make double size of the input
    // array.
    for (int nums : input) {
      result.add(nums);
      result.add(nums);
    }
    // use of for loop to iterate through the result and set all elements as 0.
    for (int i = 0; i < result.size(); i++) {

      result.set(i, 0);
    }
    // set the last element same as the last element in the input array.
    result.set(result.size() - 1, input[input.length - 1]);
    // use of for loop to check what's in the result arrayList.
    for (int j = 0; j < result.size(); j++) {
      System.out.println(result.get(j));
    }
    // return the ArrayList with correct Integers and numbers.
    return result;
  }

}
