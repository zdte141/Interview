package interviewQuestions;

import LinkedList.ListNode;

public class MergeTwoSortedList {

  public ListNode mergeTwoList(ListNode l1, ListNode l2) {
    // first check if there l1 is empty or not, if it's empty then input the l2.
    if (l1 == null) {
      return l2;
    }
    // check for l2 is empty or not, if l2 is empty then input l1 value.
    if (l2 == null) {
      return l1;
    }
    // set another ListNode that will be merged.
    ListNode mergedList;
    // if the l1's value is less then the l2 value.
    if (l1.val < l2.val) {
      // set the input as l1 priority.
      mergedList = l1;
      // use recursion method to set mergedList next and call for the method to compare l1.next and
      // l2.
      mergedList.next = mergeTwoList(l1.next, l2);
    } else {
      // else, mergedList priority with l2 value if the l2 value is smaller than l1.
      mergedList = l2;
      // call for recursive method to compare l1 and l2.next value.
      mergedList.next = mergeTwoList(l1, l2.next);
    }
    // return the new linkedList with mergedList.
    return mergedList;
  }

  /**
   * compareTwo method implement to compare the two listNode.
   * 
   * @param input ListNode input value.
   * @param output ListNode output value.
   * @return boolean value whether two listNode is equal or not.
   */
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


