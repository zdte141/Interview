package ArrayPractice;

public class Double23 {
  /**
   * boolean method double23 to return true only number 2 or 3 appears twice.
   * 
   * @param nums integer of arrays.
   * @return true only number 2 or 3 appears twice.
   */
  public boolean double23(int[] nums) {
    if (nums.length <= 1) {
      return false;
    } /*
       * use of for-loop to implement simple way to find the number 2 or 3 but only works in the
       * array length of 2. for (int i = 0; i < nums.length; i++) { if (nums[i] == 2 && nums[i + 1]
       * == 2) { return true; } else if (nums[i] == 3 && nums[i + 1] == 3) { return true; } else {
       * return false; } }
       */
    int count2 = 0;
    int count3 = 0;
    // other dynamic implementation that even array length more than 2 will work.
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2) {
        count2++;
      }
      if (nums[i] == 3) {
        count3++;
      }
    }
    if (count2 == 2 || count3 == 2) {
      return true;
    }
    return false;
  }

}
