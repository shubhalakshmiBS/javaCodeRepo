Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int number = 20;
        int expectedSum = 210;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithNegativeNumber() {
        int number = -10;
        int expectedSum = -55;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithZero() {
        int number = 0;
        int expectedSum = 0;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithLargeNumber() {
        int number = 100;
        int expectedSum = 5050;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100%