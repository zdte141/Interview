package interviewQuestions;

import java.util.List;

public class Diagonal {

  public int diagonalSum(List<List<Integer>> arr) {
    int leftdiagonal = 0, rightdiagonal = 0;

    for (int i = 0, j = arr.get(0).size() - 1; i < arr.get(0).size(); i++, j--) {

      leftdiagonal += arr.get(i).get(i);
      rightdiagonal += arr.get(i).get(j);

    }
    System.out.println(leftdiagonal);
    System.out.println(rightdiagonal);
    System.out.println(Math.abs(leftdiagonal - rightdiagonal));

    return Math.abs(leftdiagonal - rightdiagonal);

  }

}
