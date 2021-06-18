package interviewQuestions;

import LinkedList.ListNode;

public class DeleteDuplicates {

  public ListNode deleteDuplicates(ListNode input) {
    // initalise the ListNode cur = head of the listNode.
    ListNode cur = input;
    // while current and next ListNode of the current node does exist.
    while (cur != null && cur.next != null) {
      if (cur.next.val == cur.val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }
    return input;
  }

  public boolean compareTwo(ListNode input, ListNode output) {
    if (input == null && output == null) {
      return true;
    }
    if (input != null && output == null || input == null && output != null) {
      return false;
    }
    while (input != null && output != null && input.val == output.val) {
      input = input.next;
      output = output.next;
      return true;
    }
    return true;
  }
}
