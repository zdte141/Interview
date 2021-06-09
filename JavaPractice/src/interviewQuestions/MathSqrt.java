package interviewQuestions;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 * 
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part
 * of the result is returned.
 * 
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5)
 * or x ** 0.5.
 * 
 * 
 * @author sanghunlee
 *
 */
public class MathSqrt {

  public int mysqrt(int input) {
    if (input < 0) {
      return -1;
    }
    if (input == 0) {
      return 0;
    }
    if (input < 4) {
      return 1;
    }



  }



}
