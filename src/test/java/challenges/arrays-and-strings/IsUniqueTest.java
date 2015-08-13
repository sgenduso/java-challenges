package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsUniqueTest {

    private IsUnique isUnique;

    @Before
    public void setUp() {
        isUnique = new IsUnique();
    }

    @Test
    public void isUnique_ShouldReturnWhetherUnique() {
        assertEquals(true, isUnique.allUnique("orange"));
        assertEquals(false, isUnique.allUnique("banana"));
    }
}
