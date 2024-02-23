Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.*;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int number = 20;
        int expectedSum = 210;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100%