package interviewQuestions;

import java.util.List;

public class Triplet {


  public long triplet(List<Long> ar) {
    long sum = 0;

    for (int i = 0; i < ar.size(); i++) {
      sum += ar.get(i);
    }
    return sum;
  }

}
