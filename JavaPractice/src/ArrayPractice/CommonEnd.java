package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class CommonEnd {
  /**
   * boolean method commonEnd to compare the two list using the ArrayList, by getting the last index
   * of integer numbers from the a and b to identify the boolean value.
   * 
   * @param a integer of arrays of input
   * @param b integer of arrays to compare with a.
   * @return boolean values if only two arrays are having commonEnd then return true.
   */
  public boolean commonEnd(int[] a, int[] b) {
    // if one of the arrays are empty then it won't have the same common end, return false.
    if (a == null || b == null) {
      return false;
    }
    // create two arrayList to compare.
    List<Integer> input = new ArrayList<>();
    List<Integer> output = new ArrayList<>();
    // store values of a into input arrayList.
    for (int nums : a) {
      input.add(nums);
    }
    // store the values of b into output arrayList.
    for (int addNums : b) {
      output.add(addNums);
    }
    System.out.println(input.get(a.length - 1));
    System.out.println(output.get(b.length - 1));
    // if the last index of the arrayList is same then return true.
    if (input.get(a.length - 1) == output.get(b.length - 1)) {
      return true;
    }
    // otherwise return false.
    return false;
  }
}
