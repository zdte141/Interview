package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import LinkedList.ListNode;
import interviewQuestions.MergeTwoSortedList;

public class TestMergeTwoSortedList {
  // check the class for mergeTwoSortedList exist.
  @Before
  public void testClass() {
    MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
  }

  @Test
  public void testMergeTwoList() {
    MergeTwoSortedList test = new MergeTwoSortedList();
    /*
     * ListNode l1 = new ListNode(1); l1.next = new ListNode(2); l1.next.next = new ListNode(4);
     */
    ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
    /*
     * ListNode l2 = new ListNode(1); l2.next = new ListNode(3); l2.next.next = new ListNode(4);
     */
    ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

    /*
     * ListNode output = new ListNode(1); output.next = new ListNode(1); output.next.next = new
     * ListNode(2); output.next.next.next = new ListNode(3); output.next.next.next.next = new
     * ListNode(4); output.next.next.next.next.next = new ListNode(4);
     */

    ListNode output = new ListNode(1,
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null))))));

    assertTrue("check for mergeTwoList method works",
        test.compareTwo(test.mergeTwoList(l1, l2), output) == true);
  }
}
