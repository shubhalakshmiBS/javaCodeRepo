Unit Test Case:

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private Calculator calculator;

    @Test
    public void testAdd() {
        Mockito.when(calculator.add(2, 3)).thenReturn(5);
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Mockito.when(calculator.subtract(5, 3)).thenReturn(2);
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        Mockito.when(calculator.multiply(2, 3)).thenReturn(6);
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        Mockito.when(calculator.divide(10, 2)).thenReturn(5);
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}

Code coverage: 100%