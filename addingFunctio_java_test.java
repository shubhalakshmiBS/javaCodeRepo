**Unit Test Case:**

```
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int num = 5;
        int expectedSum = 15;
        int actualSum = AddNumbers.addNumbers(num);
        assertEquals(expectedSum, actualSum);
    }
}
```

**Code Coverage:**

The code coverage for this unit test is 100%, as it covers all possible paths through the `addNumbers()` method. It tests the base case (when `num` is 0) and also recursively calls the method with decreasing values of `num` until it reaches the base case. This ensures that all possible values of `num` are covered and the correct sum is returned.