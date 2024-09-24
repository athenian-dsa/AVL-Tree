package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    @Test
    public void testLLRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(3);
        avl.BSTinsert(2);
        avl.BSTinsert(1);
        avl.LL_rot();
        assertEquals(2, avl.root.data);
        assertEquals(1, avl.root.left.data);
        assertEquals(3, avl.root.right.data);
    }

    @Test
    public void testLRRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(3);
        avl.BSTinsert(1);
        avl.BSTinsert(2);
        avl.LR_rot();
        assertEquals(2, avl.root.data);
        assertEquals(1, avl.root.left.data);
        assertEquals(3, avl.root.right.data);
    }

    @Test
    public void testRRRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(1);
        avl.BSTinsert(2);
        avl.BSTinsert(3);
        avl.RR_rot();
        assertEquals(2, avl.root.data);
        assertEquals(1, avl.root.left.data);
        assertEquals(3, avl.root.right.data);
    }

    @Test
    public void testRLRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(1);
        avl.BSTinsert(3);
        avl.BSTinsert(2);
        avl.RL_rot();
        assertEquals(2, avl.root.data);
        assertEquals(1, avl.root.left.data);
        assertEquals(3, avl.root.right.data);
    }

    @Test
    public void testInsert() {
        AVL avl = new AVL();
        avl.insert(3);
        avl.insert(2);
        avl.insert(1);
        assertEquals(2, avl.root.data);
        assertEquals(1, avl.root.left.data);
        assertEquals(3, avl.root.right.data);
    }

    @Test
    public void testDelete() {
        AVL avl = new AVL();
        avl.insert(3);
        avl.insert(2);
        avl.insert(4);
        avl.insert(1);
        avl.delete(4);
        assertEquals(2, avl.root.data);
        assertEquals(1, avl.root.left.data);
        assertEquals(3, avl.root.right.data);
        assertNull(avl.root.right.right);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        int leftHeight = AVL.getHeight(node.left);
        int rightHeight = AVL.getHeight(node.right);
        return Math.abs(leftHeight - rightHeight) <= 1 
               && isBalanced(node.left) 
               && isBalanced(node.right);
    }

    @Test
    public void testTreeBalance() {
        AVL avl = new AVL();
        int[] values = {9, 5, 10, 0, 6, 11, -1, 1, 2};
        for (int value : values) {
            avl.insert(value);
        }
        assertTrue(isBalanced(avl.root));
    }
}
