package Recursion;

public class Factorial {
  /**
   * simple factorial method to multiply every factorial number of integer n.
   * 
   * @param n integer input.
   * @return mutliply of all element found in factorial process n - 1.
   */
  public int factorial(int n) {
    // base case if n is 1 then return 1.
    if (n == 1)
      return 1;
    else {
      // other than base case it will call it's own method to run the recursion.
      return n * factorial(n - 1);
    }
  }

}
