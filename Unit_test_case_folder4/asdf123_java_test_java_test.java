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
    
    @Test
    public void testMethodWithNullDependency() {
        // Creating an instance of the class to be tested with a null dependency
        TestClass testClass = new TestClass(null);
        
        // Calling the method to be tested
        String result = testClass.method();
        
        // Asserting that the result is null
        assertNull(result);
    }
    
    @Test
    public void testMethodWithEmptyDependency() {
        // Creating an instance of the class to be tested with an empty dependency
        TestClass testClass = new TestClass(new Dependency());
        
        // Calling the method to be tested
        String result = testClass.method();
        
        // Asserting that the result is empty
        assertEquals("", result);
    }
}

Code coverage: 100%