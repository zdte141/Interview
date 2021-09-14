package interviewQuestions;

import java.util.List;

public class ArraySum {

  public int arraySum(List<Integer> ar) {
    int sum = 0;

    for (int i = 0; i < ar.size(); i++) {
      sum = sum + ar.get(i);
      System.out.println(sum);
    }

    return sum;
  }

}
