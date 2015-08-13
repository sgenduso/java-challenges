package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeTest {

    private Node node;

    @Before
    public void setUp() {
        node = new Node(2);
    }

    @Test
    public void addNode_ShouldAddNodeToList() {
        assertEquals(2, node.data);
    }
}
