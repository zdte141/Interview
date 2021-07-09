package ArrayPractice;

public class Start1 {

  public int start1(int[] a, int[] b) {

    int countA = 0;
    int countB = 0;

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

    int result = countA + countB;

    return result;
  }
}
