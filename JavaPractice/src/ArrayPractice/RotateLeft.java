package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {
  /**
   * method rotateLeft to rotate integer of arrays by index - 1
   * 
   * @param input array integers.
   * @return rotated values.
   */
  public List<Integer> rotateLeft(int[] input) {
    // initialise the ArrayList test.
    List<Integer> test = new ArrayList<>();
    // add all elements in the input into test.
    for (int nums : input) {
      test.add(nums);
    }
    // use of for-loop to iterate through the values in the test and replace the elements in rotated
    // values.
    for (int i = 0; i < test.size() - 1; i++) {
      test.set(i, test.get(i + 1));
    }
    // set the last index of the arrays of first index of input values.
    test.set(test.size() - 1, input[0]);
    // check for the elemetns in the arrayList.
    System.out.println(test.toString());
    // return the rotated values.
    return test;
  }
}
