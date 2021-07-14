package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class Unlucky {
  /**
   * boolean method to return the true, only if the current element 1 and next one is 3.
   * 
   * @param nums
   * @return
   */
  public boolean unlucky(int[] nums) {
    /*
     * // use of for loop to iterate through the for loop. for (int i = 0; i < nums.length - 1; i++)
     * { // if the condition current and next is equal to 1 and 3 then return true. if (nums[i] == 1
     * && nums[i + 1] == 3) { return true; } else { return false; } } return false;
     */
    List<Integer> temp = new ArrayList<Integer>();
    for (int input : nums) {
      temp.add(input);
    }
    for (int i = 0; i < temp.size() - 1; i++) {
      if (temp.get(i) == 1 && temp.get(i + 1) == 3) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

}
