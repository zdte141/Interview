package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import interviewQuestions.ExcelSheet;

public class TestExcel {
  // TDD to test the class
  @Before
  public void testClass() {
    ExcelSheet excelSheet = new ExcelSheet();
  }

  // TDD to run the input value and expected result.
  @Test
  public void testCovertToTitle() {
    ExcelSheet test = new ExcelSheet();

    int columnNumber = 28;
    String output = "AB";

    assertTrue("the integer is converted into the String value",
        test.convertToTitle(columnNumber).equals(output));
  }

}
