import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    @Test
    public void testLLRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(8);
        avl.BSTinsert(6);
        avl.BSTinsert(4);
        avl.BSTinsert(9);
        avl.BSTinsert(7);
        avl.BSTinsert(3);
        avl.BSTinsert(5);
        avl.LL_rot();
        assertEquals(6, avl.root.data);
        assertEquals(4, avl.root.left.data);
        assertEquals(8, avl.root.right.data);
        assertEquals(3, avl.root.left.left.data);
        assertEquals(5, avl.root.left.right.data);
        assertEquals(7, avl.root.right.left.data);
        assertEquals(9, avl.root.right.right.data);
    }

    @Test
    public void testLRRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(8);
        avl.BSTinsert(4);
        avl.BSTinsert(6);
        avl.BSTinsert(9);
        avl.BSTinsert(3);
        avl.BSTinsert(5);
        avl.BSTinsert(7);
        avl.LR_rot();
        assertEquals(6, avl.root.data);
        assertEquals(4, avl.root.left.data);
        assertEquals(8, avl.root.right.data);
        assertEquals(3, avl.root.left.left.data);
        assertEquals(5, avl.root.left.right.data);
        assertEquals(7, avl.root.right.left.data);
        assertEquals(9, avl.root.right.right.data);
    }

    @Test
    public void testRRRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(4);
        avl.BSTinsert(1);
        avl.BSTinsert(6);
        avl.BSTinsert(5);
        avl.BSTinsert(8);
        avl.BSTinsert(7);
        avl.BSTinsert(9);
        avl.RR_rot();
        assertEquals(6, avl.root.data);
        assertEquals(4, avl.root.left.data);
        assertEquals(8, avl.root.right.data);
        assertEquals(1, avl.root.left.left.data);
        assertEquals(5, avl.root.left.right.data);
        assertEquals(7, avl.root.right.left.data);
        assertEquals(9, avl.root.right.right.data);
    }

    @Test
    public void testRLRotation() {
        AVL avl = new AVL();
        avl.BSTinsert(2);
        avl.BSTinsert(6);
        avl.BSTinsert(1);
        avl.BSTinsert(7);
        avl.BSTinsert(4);
        avl.BSTinsert(5);
        avl.BSTinsert(3);
        avl.RL_rot();
        assertEquals(4, avl.root.data);
        assertEquals(2, avl.root.left.data);
        assertEquals(6, avl.root.right.data);
        assertEquals(1, avl.root.left.left.data);
        assertEquals(3, avl.root.left.right.data);
        assertEquals(5, avl.root.right.left.data);
        assertEquals(7, avl.root.right.right.data);
    }

    @Test
    public void testInsertLLRotation() {
        AVL avl = new AVL();
        avl.insert(7);
        avl.insert(5);
        avl.insert(3);
        assertEquals(5, avl.root.data);
        assertEquals(3, avl.root.left.data);
        assertEquals(7, avl.root.right.data);
    }

    @Test
    public void testInsertLRRotation() {
        AVL avl = new AVL();
        avl.insert(8);
        avl.insert(4);
        avl.insert(6);
        assertEquals(6, avl.root.data);
        assertEquals(4, avl.root.left.data);
        assertEquals(8, avl.root.right.data);
    }

    @Test
    public void testInsertRRRotation() {
        AVL avl = new AVL();
        avl.insert(2);
        avl.insert(4);
        avl.insert(6);
        assertEquals(4, avl.root.data);
        assertEquals(2, avl.root.left.data);
        assertEquals(6, avl.root.right.data);
    }

    @Test
    public void testInsertRLRotation() {
        AVL avl = new AVL();
        avl.insert(1);
        avl.insert(4);
        avl.insert(2);
        assertEquals(2, avl.root.data);
        assertEquals(1, avl.root.left.data);
        assertEquals(4, avl.root.right.data);
    }

    @Test
    public void testDeleteLL() {
        AVL avl = new AVL();
        avl.insert(8);
        avl.insert(6);
        avl.insert(9);
        avl.insert(5);
        avl.insert(7);
        avl.insert(10);
        avl.insert(4);
        avl.delete(10);
        assertEquals(6, avl.root.data);
        assertEquals(5, avl.root.left.data);
        assertEquals(8, avl.root.right.data);
        assertEquals(4, avl.root.left.left.data);
        assertEquals(7, avl.root.right.left.data);
        assertEquals(9, avl.root.right.right.data);
    }

    @Test
    public void testDeleteRR() {
        AVL avl = new AVL();
        avl.insert(3);
        avl.insert(6);
        avl.insert(2);
        avl.insert(7);
        avl.insert(5);
        avl.insert(1);
        avl.insert(8);
        avl.delete(1);
        assertEquals(6, avl.root.data);
        assertEquals(3, avl.root.left.data);
        assertEquals(7, avl.root.right.data);
        assertEquals(2, avl.root.left.left.data);
        assertEquals(5, avl.root.left.right.data);
        assertEquals(8, avl.root.right.right.data);
    }

    @Test
    public void testDeleteLR() {
        AVL avl = new AVL();
        avl.insert(8);
        avl.insert(5);
        avl.insert(9);
        avl.insert(4);
        avl.insert(7);
        avl.insert(10);
        avl.insert(6);
        avl.delete(10);
        assertEquals(7, avl.root.data);
        assertEquals(5, avl.root.left.data);
        assertEquals(8, avl.root.right.data);
        assertEquals(4, avl.root.left.left.data);
        assertEquals(6, avl.root.left.right.data);
        assertEquals(9, avl.root.right.right.data);
    }

    @Test
    public void testDeleteRL() {
        AVL avl = new AVL();
        avl.insert(5);
        avl.insert(2);
        avl.insert(10);
        avl.insert(1);
        avl.insert(4);
        avl.insert(7);
        avl.insert(11);
        avl.insert(3);
        avl.insert(6);
        avl.insert(9);
        avl.insert(12);
        avl.insert(8);
        avl.delete(1);
        assertEquals(7, avl.root.data);
        assertEquals(5, avl.root.left.data);
        assertEquals(10, avl.root.right.data);
        assertEquals(3, avl.root.left.left.data);
        assertEquals(6, avl.root.left.right.data);
        assertEquals(9, avl.root.right.left.data);
        assertEquals(11, avl.root.right.right.data);
        assertEquals(2, avl.root.left.left.left.data);
        assertEquals(4, avl.root.left.left.right.data);
        assertEquals(8, avl.root.right.left.left.data);
        assertEquals(12, avl.root.right.right.right.data);
    }
}
