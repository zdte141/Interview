package ArrayPractice;

public class BiggerTwo {
  /**
   * method biggerTwo to compare the values in the array a and array b by sum of the arrays.
   * 
   * @param a integer of arrays a.
   * @param b integer of arrays b.
   * @return return the bigger sum of number.
   */
  public int[] biggerTwo(int[] a, int[] b) {
    // sum of A is set to 0 to sum of integers in arrays.
    int sumA = 0;
    // use of for loop to iterate through the a and add up all the elements.
    for (int i = 0; i < a.length; i++) {
      sumA += a[i];
    }
    System.out.println(sumA);
    // sumB is set to 0.
    int sumB = 0;
    // use of for loop to iterate through the b and add up all the elements.
    for (int j = 0; j < b.length; j++) {
      sumB += b[j];
    }
    System.out.println(sumB);
    // return the bigger number only.
    if (sumA > sumB) {
      return a;
    } else {
      return b;
    }

  }

}
