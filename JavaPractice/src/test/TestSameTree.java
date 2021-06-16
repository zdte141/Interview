package test;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import TreeNode.TreeNode;
import interviewQuestions.SameTree;

/**
 * TDD class to check for the SameTree initalise the TreeNode and compare to see the boolean value.
 * 
 * @author sanghunlee
 *
 */
public class TestSameTree {
  // check for the class exist.
  @Before
  public void testClass() {
    SameTree sameTree = new SameTree();
  }

  // initalise the TreeNode p and q to compare for the result in boolean.
  @Test
  public void testSameTree() {
    SameTree test = new SameTree();
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);

    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.left = new TreeNode(3);

    assertTrue("check for two TreeNode are equal to each other", test.sameTree(p, q) == true);
  }

}
