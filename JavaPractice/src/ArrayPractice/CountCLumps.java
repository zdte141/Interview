package ArrayPractice;

public class CountCLumps {

  public int countClumps(int[] a) {
    boolean match = false;

    int count = 0;

    for (int i = 0; i < a.length - 1; i++) {

      if (a[i] == a[i + 1] && !match) {

        match = true;

        count++;

      }

      else if (a[i] != a[i + 1]) {

        match = false;

      }

    }

    return count;

  }

}
