package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import TreeNode.TreeNode;
import interviewQuestions.MaxDepth;

public class TestMaxDepth {
  // before make the test case check for the class exist in the java file.
  @Before
  public void testClass() {
    MaxDepth maxDepth = new MaxDepth();
  }

  // test case to construct the Binary tree using TreeNode and run the test case.
  @Test
  public void testMaxDepthTree() {
    MaxDepth test = new MaxDepth();

    TreeNode root = new TreeNode(3);

    root.left = new TreeNode(9);
    root.right = new TreeNode(20);

    TreeNode temp = root.right;

    temp.left = new TreeNode(15);
    temp.right = new TreeNode(7);

    int output = 3;

    System.out.println(test.maxDepth(root));

    assertTrue("check for the maxDepth of the tree", test.maxDepth(root) == output);

  }

}
