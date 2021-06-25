package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import TreeNode.TreeNode;

public class BinaryTreeInOrder {
  /**
   * recursive method to memeorise and call, store the result in the new ArrayList for the output.
   * 
   * @param root from root of the Binary Tree.
   * @return output of Inorder result of Binary Tree reader in the arraylist.
   */
  public List<Integer> inorderTraversal(TreeNode root) {

    List<Integer> output = new ArrayList<>();
    reader(root, output);
    return output;

  }

  /**
   * if the child of the root is not null then search more of it's child node using recursive call,
   * of reader(root, output) method until it reach to the end of the Binary Tree.
   * 
   * @param root is the root (beginning of the Binary tree)
   * @param output is the result of the Integer arrayList read in indorder traversal.
   */
  private void reader(TreeNode root, List<Integer> output) {
    if (root != null) {
      if (root.left != null) {
        reader(root.left, output);
      }
      output.add(root.val);
      if (root.right != null) {
        reader(root.right, output);
      }
    }
  }
}
