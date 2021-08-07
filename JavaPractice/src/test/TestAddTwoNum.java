package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import LinkedList.ListNode;
import interviewQuestions.AddTwoNum;

public class TestAddTwoNum {
  @Before
  public void testClass() {
    AddTwoNum addTwoNum = new AddTwoNum();
  }

  @Test
  public void testAddTwoNum() {
    AddTwoNum test = new AddTwoNum();

    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode result = new ListNode(7);
    result.next = new ListNode(0);
    result.next.next = new ListNode(8);

    assertTrue("addTwoNum will add both number in the listnode to return new added number listnode",
        test.addTwoNum(l1, l2).equals(result));

  }

}
