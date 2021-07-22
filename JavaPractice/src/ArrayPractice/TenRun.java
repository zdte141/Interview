package ArrayPractice;

/**
 * For each multiple of 10 in the given array, change all the values following it to be that
 * multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10,
 * 10, 10, 20, 20}.
 * 
 * @author sanghunlee
 *
 */
public class TenRun {
  /**
   * method tenRun to changes the values of it's multiple of 10 number is found.
   * 
   * @param nums integer of arrays.
   * @return new arrays with changed values.
   */
  public int[] tenRun(int[] nums) {
    // set the counter to find the index of where the first multiple of 10 number is found.
    int countA = 0;
    int countB = 0;
    // use for loop to iterate through and find the index of 10s.
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 10) {
        break;
      }
      countA++;
    }
    // use another for loop to iterate through and find the index of 20s.
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] == 20) {
        break;
      }
      countB++;

    }
    // check the index values.
    System.out.println("countA index : " + countA);
    System.out.println("countB index : " + countB);
    // change all the values in the arrays 10s.
    for (int k = countA + 1; k < countB; k++) {
      nums[k] = 10;
    }
    // change all the values in the arrays to 20s
    for (int o = countB; o < nums.length; o++) {
      nums[o] = 20;
    }
    // print out using for each loop.
    for (int input : nums) {
      System.out.println(input);
    }
    return nums;
  }

}
