package ArrayPractice;

public class MakeMiddle {
  /**
   * makeMiddle method to find the middle index and return two elements.
   * 
   * @param nums integer of arrays.
   * @return the result of arrays with two elements find in the middle.
   */
  public int[] makeMiddle(int[] nums) {
    int middle = nums.length / 2;
    int[] result = {nums[nums.length / 2 - 1], nums[nums.length / 2]};

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
    return result;
  }

}
