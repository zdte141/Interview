package interviewQuestions;

import TreeNode.TreeNode;

public class MaxDepth {
  /**
   * maxDepth method to find the depth of the binary tree.
   * 
   * @param root of the TreeNode in Binary tree constructed in it's test case.
   * @return maximum depth of the tree in integer.
   */
  public int maxDepth(TreeNode root) {
    // if from the root of the tree is null then return 0 since there is no depth of the tree node.
    if (root == null) {
      return 0;
    }
    // use of Math maximum function to compare depth of the left and right tree and + 1.
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }

}
