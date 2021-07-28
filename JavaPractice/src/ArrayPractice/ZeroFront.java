package ArrayPractice;

import java.util.HashMap;
import java.util.Map;

public class ZeroFront {

  public Map<Integer, Integer> zeroFront(int[] nums) {
    int[] result = nums.clone();

    Map<Integer, Integer> test = new HashMap<Integer, Integer>();

    for (int i = 0; i < result.length; i++) {
      test.put(i, result[i]);
    }
    test.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    return test;
  }


}
