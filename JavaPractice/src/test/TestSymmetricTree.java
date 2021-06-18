package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import TreeNode.TreeNode;
import interviewQuestions.SymmetricTree;

public class TestSymmetricTree {
  @Before
  public void testClass() {
    SymmetricTree symmmetricTree = new SymmetricTree();
  }

  @Test
  public void testSymmetricTree() {
    SymmetricTree test = new SymmetricTree();

    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode(2);

    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);

    root.right.left = new TreeNode(4);
    root.right.left = new TreeNode(3);

    assertTrue("check for the symmetric tree", test.isSymmetric(root) == true);
  }

}
