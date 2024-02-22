Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int number = 20;
        int expectedSum = 210;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100% (based on the given code, all lines are covered by the unit test)