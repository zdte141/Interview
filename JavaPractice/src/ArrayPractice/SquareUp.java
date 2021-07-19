package ArrayPractice;

public class SquareUp {

  public int[] squareUp(int n) {
    // new arrays that has size of n * n.
    int[] result = new int[n * n];
    // initlaise the limit and count;
    int limit = n;
    int count = 1;
    // if the n is 1 then only 1 is result in the arrays.
    if (n == 1) {
      result[0] = 1;
      return result;
    }
    // for loop to make condition where,
    // result.length - 1 is because always rightmost integer in arrays is 1.
    // j = 1 to increment to n number.
    // from right most to left input the values.
    for (int i = result.length - 1, j = 1; i >= 0; i--) {
      // if j is less than the limit where it can be increment eg. int n.
      if (j <= limit) {
        // input the values from right most integer i of j as it get increment to n.
        result[i] = j;
        j++;
      } else {
        // else then set the value to 0.
        result[i] = 0;
      }
      // if count == n where it reaches to n number.
      if (count == n) {
        // reset the count to 0.
        count = 0;
        // decrease the limit by 1.
        limit = limit - 1;
        // reset the j = 1.
        j = 1;
      }
      // count increment.
      count++;
    }
    // return the result.
    return result;

  }

}
