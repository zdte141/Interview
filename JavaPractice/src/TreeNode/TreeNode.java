package TreeNode;

/**
 * TreeNode structure to set the all variables in public so other class can import to use it.
 * 
 * @author sanghunlee
 *
 */
public class TreeNode {
  // int val to initialise the input value.
  public int val;
  // tree node left
  public TreeNode left;
  // tree node right.
  public TreeNode right;

  public TreeNode() {}

  // treeNode constructor with val input.
  public TreeNode(int val) {
    this.val = val;
  }

  // TreeNode constructor with val, left and right.
  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
