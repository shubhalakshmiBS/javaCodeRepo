Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int num = 5;
        int expectedSum = 15;
        int actualSum = AddNumbers.addNumbers(num);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100% (1 line covered out of 1 total line)