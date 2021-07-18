package ArrayPractice;

public class LinearIn {
  /**
   * method linearIn to check if all inner arrays exist in the outer arrays.
   * 
   * @param outer arrays of integer.
   * @param inner arrays of integer.
   * @return boolean value, if only all inner arrays integer exist in the outer arrays then return
   *         true.
   */
  public boolean linearIn(int[] outer, int[] inner) {
    int num = 0;
    int count = 0;
    // use of for loop to iterate through the outer arrays and compare if there is same element.
    for (int i = 0; i < outer.length; i++) {
      if (outer[i] == inner[count]) {
        num++;
        count++;
      }
      // only if num is = inner.length which means all elements are exist in the outer arrays return
      // true.
      if (num == inner.length) {
        return true;
      }
    }
    // Default value is set to false.
    return false;
  }
}
