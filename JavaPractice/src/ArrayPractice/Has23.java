package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class Has23 {

  public boolean has23(int[] nums) {

    /*
     * Direct Array implementation. for (int i = 0; i < nums.length; i++) { if (nums[i] == 2 ||
     * nums[i] == 3 || nums[i + 1] == 2 || nums[i + 1] == 3) { return true; } else { return false; }
     * } return false; }
     */
    // ArrayList implementation.
    List<Integer> temp = new ArrayList<Integer>();
    // add up all the elements in the arrays into arrayList using for each loop.
    for (int input : nums) {
      temp.add(input);
    }
    // check if the temp contains of elements 2 or 3,
    if (temp.contains(2) || temp.contains(3)) {
      // return true if it contains those elements.
      return true;
    } else {
      // otherwise return false.
      return false;
    }


  }

}
