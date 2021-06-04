package interviewQuestions;

public class SortArray {
  /**
   * method to remove the duplicated integer in the array
   * 
   * @param nums integer of arrays.
   * @return the count of index in the removed array.
   */
  public int removeSortArray(int[] nums) {
    // if the input nums is empty then return the 0.
    if (nums.length == 0) {
      return 0;
    }
    // set the index to count the integers in the arrays.
    int index = 0;
    // use the for loop to iterate through the arrays nums.
    for (int i = 1; i < nums.length; i++) {
      // if integer in array at i is not same to array at index
      if (nums[i] != nums[index]) {
        // then increase the index size by 1.
        index++;
        // set arrays at index equal to arrays at i.
        nums[index] = nums[i];
      }
    }
    // return the count of index.
    return index + 1;

  }
}

