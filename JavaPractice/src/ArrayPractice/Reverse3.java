package ArrayPractice;

public class Reverse3 {
  /**
   * method reverse to give result of the reversed array.
   * 
   * @param input values if integer arrays.
   * @return the output of reversed elements in the array.
   */
  public int[] reverse(int[] input) {
    // clone the arrays of input into result array.
    int[] result = input.clone();
    // for loop to reverse iterate through the input array.
    for (int i = input.length - 1; i >= 0; i--) {
      // give out the result with the reversed input.
      result[i] = input[input.length - i - 1];
    }
    return result;
  }

}
