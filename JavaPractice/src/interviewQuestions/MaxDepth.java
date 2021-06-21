package interviewQuestions;

import TreeNode.TreeNode;

public class MaxDepth {

  public int maxDepth(TreeNode root) {
    // if from the root of the tree is null then return 0 since there is no depth of the tree node.
    if (root == null) {
      return 0;
    }
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }

}
