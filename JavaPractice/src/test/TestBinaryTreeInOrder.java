package test;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import TreeNode.TreeNode;
import interviewQuestions.BinaryTreeInOrder;

public class TestBinaryTreeInOrder {
  // test case to check for the corresponding class
  @Before
  public void testClass() {
    BinaryTreeInOrder binaryTreeInOrder = new BinaryTreeInOrder();
  }

  // test case to construct the binary tree and compare with the arraylist<integer> using TDD.
  @Test
  public void testInorder() {
    BinaryTreeInOrder test = new BinaryTreeInOrder();

    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    root.right.left = new TreeNode(3);

    List<Integer> output = new ArrayList<Integer>();
    output.add(1);
    output.add(3);
    output.add(2);
    System.out.println(output.toString());
    assertTrue("check if the BinaryTree is read in inorder", test.inorderTraversal(root) == output);
  }

}
