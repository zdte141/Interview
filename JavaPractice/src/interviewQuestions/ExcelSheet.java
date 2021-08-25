package interviewQuestions;

public class ExcelSheet {
  /**
   * method convertToTitle to return the correct String value from the integer input.
   * 
   * @param columnNumber integer input
   * @return string value
   */
  public String convertToTitle(int columnNumber) {
    // declare all the alphabet into the char value.
    char arr[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'W', 'X', 'Y', 'Z'};
    // build the stringbuilder in order to store the string value.
    StringBuilder sb = new StringBuilder();
    // while loop to iterate through if the columnNumber is bigger than 0.
    while (columnNumber > 0) {
      // if the columnNUmber 26
      if (columnNumber % 26 == 0) {
        // insert the z into the first string builder.
        sb.insert(0, 'Z');
        // decrement the columnNumber.
        columnNumber--;
      } else {
        // otherwise inser the value from 25.
        sb.insert(0, arr[columnNumber % 26 - 1]);
        // devide the columnNumber by 26 to find the next row.
        columnNumber /= 26;
      }

    }
    // return the value in string value.
    return sb.toString();
  }

}
