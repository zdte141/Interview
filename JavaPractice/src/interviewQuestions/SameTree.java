package interviewQuestions;

import TreeNode.TreeNode;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or
 * not.
 * 
 * Two binary trees are considered the same if they are structurally identical, and the nodes have
 * the same value.
 * 
 * 
 * @author sanghunlee
 *
 */
public class SameTree {
  /**
   * method to check for the same tree in recursive method.
   * 
   * @param p TreeNode p with val, left and right.
   * @param q TreeNode q with val, left and right.
   * @return boolean value.
   */
  public boolean sameTree(TreeNode p, TreeNode q) {
    // if both TreeNode is empty then it's a same tree.
    if (p == null & q == null) {
      return true;
    }
    // if 'Or' state then it's not the same structure return false.
    if (p == null || q == null) {
      return false;
    }
    // if the value inside the stucture is not same then return false.
    if (p.val != q.val) {
      return false;
    }
    // call the sameTree Method for left and right for both TreeNode to check for boolean value.
    return sameTree(p.right, q.right) && sameTree(p.left, q.left);
  }

}
