package ArrayPractice;

public class MaxMirror {

  public int maxMirror(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int count = 0;
    int reverse = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == nums[reverse]) {
        count++;
      }
      reverse--;
    }
    return count / 2;
  }

}
