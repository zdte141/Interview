package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import LinkedList.ListNode;
import interviewQuestions.DeleteDuplicates;

/**
 * Test Class to check DeleteDuplicates.java correctly works.
 * 
 * @author sanghunlee
 *
 */
public class TsetDeleteDuplicates {

  @Before
  public void testClass() {
    DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
  }

  @Test
  public void testDeleteDuplicates() {
    DeleteDuplicates test = new DeleteDuplicates();

    ListNode input = new ListNode(1);
    input.next = new ListNode(1);
    input.next.next = new ListNode(2);

    ListNode output = new ListNode(1);
    output.next = new ListNode(2);


    System.out.println(test.deleteDuplicates(input).val);
    System.out.println(test.deleteDuplicates(input).next.val);
    System.out.println(output.val);
    System.out.println(output.next.val);

    assertTrue("check for deleteDuplicates method works",
        test.compareTwo(test.deleteDuplicates(input), output) == true);
  }

}
