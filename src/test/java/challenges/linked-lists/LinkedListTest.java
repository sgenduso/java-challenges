package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
        Object[] nodesToAdd = {1,2,4,2,3,4};
        linkedList.addMultipleNodes(nodesToAdd);
        linkedList.removeDupes();
    }

    @Test
    public void removeDupes_ShouldRemoveDuplicateNodes() {
        assertEquals(4, linkedList.listLength());
    }
    // @Before
    // public void setUp() {
    //     linkedList = new LinkedList();
    //     Object[] nodesToAdd = {1,2,4,2,3,4};
    //     linkedList.addMultipleNodes(nodesToAdd);
    // }
    //
    // @Test
    // public void addMultipleNodes_ShouldAddNodesToList() {
    //     assertEquals(6, linkedList.listLength());
    // }
}
