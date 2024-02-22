Unit Test Case:
```
import org.junit.Assert;
import org.junit.Test;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int number = 20;
        int expectedSum = 210;
        int actualSum = AddNumbers.addNumbers(number);
        Assert.assertEquals(expectedSum, actualSum);
    }
}
```

Code Coverage: 100% (based on the given code, all lines are covered)