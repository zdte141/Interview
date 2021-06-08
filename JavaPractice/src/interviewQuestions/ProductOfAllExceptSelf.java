package interviewQuestions;

/*
 * Given an array of integers, return a new array such that each element at index i of the new array
 * is the product of all the numbers in the original array except the one at i. For example, if our
 * input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was
 * [3, 2, 1], the expected output would be [2, 3, 6]. Follow-up: what if you can't use division?
 */
public class ProductOfAllExceptSelf {
  /**
   * input of integer array will return the new array with new integer values in index with multiply
   * of all integer number other than it's index integer.
   * 
   * @param arr from the input arrays.
   * @return new array integer output with multiply of all other integer index.
   */
  public int[] getProductArr(int[] arr) {
    // make new array called product array with same length of the input array.
    int[] productArr = new int[arr.length];
    // set integer num equal to 1.
    int num = 1;
    // use of for loop to iterate through the input arrays.
    for (int i = 0; i < arr.length; i++) {
      // set all index of productArr at i th equals to num
      productArr[i] = num;
      // each loop num = multiply each of all array of all ith number.
      num *= arr[i];
    }
    // reset the num = 1.
    num = 1;
    // from opposite of increment for loop. now it loop from the last index of array to the first.
    for (int i = arr.length - 1; i >= 0; i--) {
      // doing the same stuff from backwards.
      productArr[i] *= num;
      // set the num = array[i] * array[i+1];
      num *= arr[i];
    }
    // return the whole product of all except self array.
    return productArr;
  }

}
