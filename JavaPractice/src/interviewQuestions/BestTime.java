package interviewQuestions;

/**
 * Q123. Algorithm to find the Maximum profit from multiple transaction.
 * 
 * @author sanghunlee
 *
 */
public class BestTime {

  public int maxProfit(int[] prices) {
    // if the array of length equal to zero, nothing inside the array.
    if (prices.length == 0)
      // return 0;
      return 0;
    // initialise the max value to 0.
    int max = 0;
    // use for loop to iterate length of array size.
    for (int i = 0; i < prices.length - 1; i++) {
      // if price of the current is less than price or index + 1
      if (prices[i] < prices[i + 1]) {
        // max is addition of price i + 1 index minus price of i index.
        max += prices[i + 1] - prices[i];
      }
    }
    // return the max value.
    return max;
  }

}
