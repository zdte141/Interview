package ArrayPractice;

public class Start1 {
  /**
   * method start1 to return the combine number of count a and b of specific element.
   * 
   * @param a integer array A.
   * @param b Integer array B.
   * @return return of the total count of specific number.
   */
  public int start1(int[] a, int[] b) {
    // initialise both a and b counter.
    int countA = 0;
    int countB = 0;
    // use of for loop to iterate through and count the number of element occuring in array.
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        countA++;
      }
    }

    for (int j = 0; j < b.length; j++) {
      if (b[j] == 1) {
        countB++;
      }
    }
    // conbine the two counter to give the final result.
    int result = countA + countB;

    return result;
  }
}
