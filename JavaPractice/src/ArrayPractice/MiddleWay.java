package ArrayPractice;

/**
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle
 * elements.
 * 
 * @author sanghunlee
 *
 */
public class MiddleWay {
  /**
   * method middleWay to find the mid point of the arrays and return in result int [] arrays
   * 
   * @param a integer of array a.
   * @param b intger of array b.
   * @return the new result array with two mid point from a and b.
   */
  public int[] middleWay(int[] a, int[] b) {
    // initialise the integer array result with 2 variables.
    int[] result = {0, 0};
    // check if there is any elements in the array, if there is return the mid point of the array.
    if (a.length != 0) {
      result[0] = a[a.length / 2];
    }

    if (b.length != 0) {
      result[1] = b[b.length / 2];
    }
    // using for loop to iterate through the array and print out the elements inside.
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
    // return the result that contains the mid point from a and b.
    return result;
  }
}
