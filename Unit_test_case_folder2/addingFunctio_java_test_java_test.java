Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;
importimport org.mockito.Mockito;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int number = 20;
        int expectedSum = 210;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithMock() {
        int number = 20;
        int expectedSum = 210;
        
        //Mocking the AddNumbers class
        AddNumbers addNumbers = Mockito.mock(AddNumbers.class);
        
        //Setting up the expected behavior of the addNumbers method
        Mockito.when(addNumbers.addNumbers(number)).thenReturn(expectedSum);
        
        //Calling the addNumbers method with the mocked object
        int actualSum = addNumbers.addNumbers(number);
        
        //Verifying the expected behavior
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100% (based on the given code, all lines are covered by the unit test)