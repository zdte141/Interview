package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class Sum3 {
  /**
   * method sum3 to add up all 3 integer in the array input to give a correct output.
   * 
   * @param input arrays of integer input.
   * @return sum of all 3 integers in the array.
   */
  public int sum3(int[] input) {
    // create new ArrayList test to store the input array values.
    List<Integer> test = new ArrayList<>();
    // using .add method in ArrayList to store all the values.
    for (int nums : input) {
      test.add(nums);
    }
    // initialise the empty result integer values to get the final result.
    int result = 0;
    // use of for loop to iterate through the size of the test ArrayList.
    for (int i = 0; i < test.size(); i++) {
      // than add up each integer numbers in the Arrays by index of i,
      result = result + test.get(i);
    }
    // return the final sum of 3 result.
    System.out.println(result);
    return result;
  }

}
