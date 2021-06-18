package interviewQuestions;

import TreeNode.TreeNode;

/**
 * SymmetricTree class to implement method to check the symmetric tree.
 * 
 * @author sanghunlee
 *
 */
public class SymmetricTree {
  // boolean method to check for symmetric tree from the root divide the tree by left and right side
  // of the tree.
  public boolean isSymmetric(TreeNode root) {
    return isMirror(root, root);
  }

  /**
   * boolean method to compare two root of the tree from left and the right side using recursion.
   * 
   * @param r1 left side of binary tree.
   * @param r2 right side of binary tree.
   * @return boolean value.
   */
  private boolean isMirror(TreeNode r1, TreeNode r2) {
    // if both side from the root is the null value then return true.
    if (r1 == null && r2 == null)
      return true;
    // if only one side is null then it's no longer symmetric.
    if (r1 == null || r2 == null)
      return false;
    // if the root of left and right side of the tree is same and child node of the binary tree is
    // symmetric
    return (r1.val == r2.val) && isMirror(r1.right, r2.left) && isMirror(r1.left, r2.right);
  }

}
