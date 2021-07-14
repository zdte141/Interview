package ArrayPractice;

public class Unlucky {
  /**
   * boolean method to return the true, only if the current element 1 and next one is 3.
   * 
   * @param nums
   * @return
   */
  public boolean unlucky(int[] nums) {
    // use of for loop to iterate through the for loop.
    for (int i = 0; i < nums.length; i++) {
      // if the condition current and next is equal to 1 and 3 then return true.
      if (nums[i] == 1 && nums[i + 1] == 3) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

}
