package ArrayPractice;

public class MakeEnds {
  /**
   * makeEnds method to give back the only first and last elements to new arrays.
   * 
   * @param nums integer of arrays
   * @return arrays result with two elements from nums.
   */
  public int[] makeEnds(int[] nums) {
    // make the new array result with index of 2 to store the first and last elements of integer in
    // nums arrays.
    int[] result = {0, 0};
    // first element in the result is equal to first element in the nums.
    result[0] = nums[0];
    // second element in the result is last element in the array.
    result[1] = nums[nums.length - 1];
    // return the result.
    return result;
  }

}
