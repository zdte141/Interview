package TestMapPractice;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import MapPractice.MapBully;

/**
 * TDD to run the test MapBully.java.
 * 
 * @author sanghunlee
 *
 */
public class TestMapBully {
  // Test to run whether MapBully.java exist.
  @Before
  public void testClass() {
    MapBully mapBully = new MapBully();
  }

  // TDD to initalise the input and output values to compare and check the method mapBully working.
  @Test
  public void testMapBully() {
    MapBully test = new MapBully();

    Map<String, String> input = new HashMap<String, String>();
    Map<String, String> output = new HashMap<String, String>();

    input.put("a", "candy");
    input.put("b", "dirt");

    output.put("a", "");
    output.put("b", "candy");

    assertTrue("check if the mapBully method replace the map values",
        test.mapBully(input).equals(output));

  }

}
