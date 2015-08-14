package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
        int[] nodesToAdd = {1,2,4,2,3,4};
        linkedList.addMultipleNodes(nodesToAdd);
    }

    @Test
    public void addMultipleNodes_ShouldAddNodesToList() {
        assertEquals(2, linkedList);
    }
}