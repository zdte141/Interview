package interviewQuestions;

public class RichCus {

  public int richCus(int[][] account) {
    int max = 0;

    int[] result = new int[account.length];

    for (int i = 0; i < account.length; i++) {
      int sum = 0;
      for (int j = 0; j < account[i].length; j++) {
        sum = sum + account[i][j];
        if (sum > max) {
          max = sum;
        }
      }
    }
    return max;
  }

}
