package ArrayPractice;

public class MaxTriple {
  /**
   * method maxTriple to return the biggest number in the nums array.
   * 
   * @param nums of integer arrays.
   * @return biggest number in the integer
   */
  public int maxTriple(int[] nums) {
    // set the integer result to store the values.
    int result = 0;
    // use of for loop to iterate through the array
    for (int i = 0; i < nums.length; i++) {
      // compare the current integer result to every index of elements in the array.
      result = Math.max(result, nums[i]);
    }
    System.out.println(result);
    // return the result.
    return result;
  }

}
