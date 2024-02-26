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
    public void testAddNumbers_negativeLargeNumber() {
        int number = -1000;
        int expectedSum = -500500;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_oddNumber() {
        int number = 5;
        int expectedSum = 15;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_evenNumber() {
        int number = 6;
        int expectedSum = 21;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_negativeOddNumber() {
        int number = -5;
        int expectedSum = -15;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_negativeEvenNumber() {
        int number = -6;
        int expectedSum = -21;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_maxInteger() {
        int number = Integer.MAX_VALUE;
        int expectedSum = -2147483648;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbers_minInteger() {
        int number = Integer.MIN_VALUE;
        int expectedSum = -2147483648;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100%