package ArrayPractice;

public class BiggerTwo {

  public int[] biggerTwo(int[] a, int[] b) {
    int sumA = 0;

    for (int i = 0; i < a.length; i++) {
      sumA += a[i];
    }
    System.out.println(sumA);
    int sumB = 0;
    for (int j = 0; j < b.length; j++) {
      sumB += b[j];
    }
    System.out.println(sumB);
    if (sumA > sumB) {
      return a;
    } else {
      return b;
    }

  }

}
