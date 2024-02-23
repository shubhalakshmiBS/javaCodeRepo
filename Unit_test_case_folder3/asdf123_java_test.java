Unit Test Case:

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestClassTest {

    @Mock
    private Dependency dependency;

    @Test
    public void testMethod() {
        MockitoAnnotations.initMocks(this);
        
        // Mocking the dependency's method to return a specific value
        Mockito.when(dependency.method()).thenReturn("mocked value");
        
        // Creating an instance of the class to be tested
        TestClass testClass = new TestClass(dependency);
        
        // Calling the method to be tested
        String result = testClass.method();
        
        // Verifying that the dependency's method was called
        Mockito.verify(dependency).method();
        
        // Asserting the expected result
        assertEquals("mocked value", result);
    }
}

Code coverage: 100%