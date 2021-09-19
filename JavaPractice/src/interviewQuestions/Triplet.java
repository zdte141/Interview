package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Triplet {



  public List<Integer> triplet(List<Integer> a, List<Integer> b) {
    List<Integer> result = new ArrayList<Integer>(2);
    int aCount = 0;
    int bCount = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        aCount++;
      } else if (a.get(i) != b.get(i)) {
        bCount++;
      }
    }
    result.add(aCount);
    result.add(bCount);
    return result;
  }
}


