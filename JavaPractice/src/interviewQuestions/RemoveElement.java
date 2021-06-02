package interviewQuestions;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the
 * new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * @author sanghunlee
 *
 */
public class RemoveElement {

  public int romoveElement(int[] input, int val) {
    // initialise index of i to use in the array counts.
    int i = 0;
    // use for loop to iterate through the array using j.
    for (int j = 0; j < input.length; j++) {
      // if array at j index is not equal to val.
      if (input[j] != val) {
        // re-initialise array input [i] of the value in array index j.
        input[i] = input[j];
        // increase the index of i by 1.
        i++;
      }
    }
    // return the count of i.
    return i;
  }

}
