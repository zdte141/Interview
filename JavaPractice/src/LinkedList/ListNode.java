package LinkedList;

/**
 * Class ListNode to initalise the ListNode, value and it's next pointer.
 * 
 * @author sanghunlee
 *
 */
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {

  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
