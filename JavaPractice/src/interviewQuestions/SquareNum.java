package interviewQuestions;

/**
 * square the integer using without the Maths.function, try both while and for loop.
 * 
 * @author sanghunlee
 *
 */
public class SquareNum {
  /**
   * Method squareNum is to power the n th number depend on it's power number, it will multiply
   * baseNum in nth number.
   * 
   * @param baseNum base number in the sqareNum
   * @param power is number of Nth number where baseNum will multiply by itself.
   * @return the squared number.
   */
  public int squareNum(int baseNum, int power) {
    if (baseNum == 0) {
      return 0;
    }
    if (power == 1) {
      return baseNum;
    }
    if (power < 0) {
      return -1;
    }
    /*
     * try in the while loop. int count = 1;
     * 
     * int output = 1; while (count <= power) { count++; output *= baseNum;
     * 
     * System.out.println(output);
     * 
     * } return output;
     */
    int output = 1;
    for (int i = 0; i < power; i++) {
      output *= baseNum;
    }
    return output;
  }

}
