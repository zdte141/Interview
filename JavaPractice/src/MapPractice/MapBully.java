package MapPractice;

import java.util.Map;

/**
 * 
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have
 * that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value
 * and replacing it with the empty string.
 * 
 * 
 * @author sanghunlee
 *
 */
public class MapBully {
  /**
   * method mapBully to replace the values inside the map to get new output value.
   * 
   * @param input of String with key and corresponding
   * @return replaced new output.
   */
  public Map<String, String> mapBully(Map<String, String> input) {
    System.out.println(input.get("a"));
    System.out.println(input.get("b"));
    // check if the key "b" exist in the HashMap.
    if (input.containsKey("b")) {
      // if it exist then replace it's value to a's value.
      input.replace("b", input.get("a"));
    }
    // check if the key "a" exist.
    if (input.containsKey("a")) {
      // then replace key a value into empty string.
      input.replace("a", "");
    }
    return input;
  }

}
