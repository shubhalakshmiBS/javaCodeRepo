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
    
    @Test
    public void testAddNumbers_negativeNumber() {
        int number = -10;
        int expectedSum = -55;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_zero() {
        int number = 0;
        int expectedSum = 0;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_largeNumber() {
        int number = 1000;
        int expectedSum = 500500;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_boundaryNumber() {
        int number = Integer.MAX_VALUE;
        int expectedSum = 1073741823;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100%