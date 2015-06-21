package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathServiceTest {

    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void add_ShouldReturnAddedNumbers() {
        assertEquals((Integer) 3, mathService.add(1, 2));
    }
}
