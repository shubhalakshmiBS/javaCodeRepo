**Unit Test Case:**

```
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class UnitTestGenerator {

    @Mock
    private SomeDependency someDependency;

    @Test
    public void testGetFullName() {
        // Arrange
        String firstName = "John";
        String lastName = "Doe";
        String expectedFullName = "John Doe";

        // Act
        SomeClass someClass = new SomeClass(someDependency);
        String actualFullName = someClass.getFullName(firstName, lastName);

        // Assert
        assertNotNull(actualFullName);
        assertEquals(expectedFullName, actualFullName);
    }

    @Test
    public void testGetAge() {
        // Arrange
        int birthYear = 1990;
        int currentYear = 2021;
        int expectedAge = 31;

        // Act
        SomeClass someClass = new SomeClass(someDependency);
        int actualAge = someClass.getAge(birthYear, currentYear);

        // Assert
        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testGetGreeting() {
        // Arrange
        String firstName = "John";
        String expectedGreeting = "Hello John!";

        // Mock
        Mockito.when(someDependency.getGreeting()).thenReturn("Hello");

        // Act
        SomeClass someClass = new SomeClass(someDependency);
        String actualGreeting = someClass.getGreeting(firstName);

        // Assert
        assertNotNull(actualGreeting);
        assertEquals(expectedGreeting, actualGreeting);
    }
}
```

**Code Coverage:**

- The unit tests cover all three methods in the `SomeClass` class.
- The `getFullName()` method is tested with valid input and the expected output is verified.
- The `getAge()` method is tested with valid input and the expected output is verified.
- The `getGreeting()` method is tested with a mocked dependency to ensure the correct behavior of the method.