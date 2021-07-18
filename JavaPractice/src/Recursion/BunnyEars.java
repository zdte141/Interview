package Recursion;

public class BunnyEars {
  /**
   * recursion method to call itself under base case condition.
   * 
   * @param bunnies number of bunnies to count the number of ears.
   * @return how many ears does bunnines have.
   */
  public int bunnyEars(int bunnies) {
    // base case when no bunnies then no ears.
    if (bunnies == 0) {
      return 0;
    } else {
      // call itself to make recursion method.
      return bunnies * 2;
    }
  }

}
