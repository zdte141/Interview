package ArrayPractice;

/*
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3
 * element to 0. Return the changed array.
 * 
 * 
 */
public class Fix23 {

  public int[] fix23(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 3) {
        nums[i + 1] = 0;
      }
    }
    return nums;
  }
  /**
   * method fix23 to check the following integer array of 2 is 3 is replace to 0.
   * 
   * @param nums integer of arrays nums containing 3 numbers.
   * @return new replaced number of integers.
   * 
   */
  /*
   * public List<Integer> fix23(int[] nums) {
   * 
   * // create the arrayList test List<Integer> test = new ArrayList<>(); // add the values into the
   * arrayList. for (int temp : nums) { test.add(temp); } // dynamic code to which can implement all
   * length of arrays. for (int i = 0; i < test.size() - 1; i++) { // if the index number contains 2
   * and following one is 3 then set the 3 to 0. if (test.get(i) == 2 && test.get(i + 1) == 3) {
   * 
   * test.set(i + 1, 0); } } // return the new arrayList. return test; }
   */

}
