package interviewQuestions;

public class TwoSum2 {

  public int[] twoSum2(int[] nums, int target) {

    int start = 0, end = nums.length - 1;

    while (start < end) {
      if (nums[start] + nums[end] == target) {
        return new int[] {start + 1, end + 1};
      } else if (nums[start] + nums[end] < target) {
        ++start;
      } else {
        --end;
      }
    }

    return new int[] {-1, -1};
  }

}


