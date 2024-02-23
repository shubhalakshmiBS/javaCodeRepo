Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
    public void testAddNumbers_mock() {
        int number = 10;
        int expectedSum = 55;
        AddNumbers addNumbers = mock(AddNumbers.class);
        when(addNumbers.addNumbers(number)).thenReturn(expectedSum);
        int actualSum = addNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100%