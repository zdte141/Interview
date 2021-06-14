package interviewQuestions;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * @author sanghunlee
 *
 */
public class ClimbingStairs {
  // recursive approach to sotre the result of the each step in memo array.
  public int climbingStairs(int input) {
    int memo[] = new int[input + 1];
    // directly returning the result from the memo array.
    return climb_method(0, input, memo);
  }

  private int climb_method(int i, int input, int[] memo) {
    if (i > input) {
      return 0;
    }
    if (i == input) {
      return 1;
    }
    if (memo[i] > 0) {
      return memo[i];
    }
    memo[i] = climb_method(i + 1, input, memo) + climb_method(i + 2, input, memo);
    return memo[i];
  }


}
