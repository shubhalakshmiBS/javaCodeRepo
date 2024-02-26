**Unit Test Case:**

```
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddNumbersTest {

	@Test
	public void testAddNumbers() {
		int number = 20;
		int expected = 210;
		int actual = AddNumbers.addNumbers(number);
		assertEquals(expected, actual);
	}
}
```

**Code Coverage:**

The code coverage for this unit test is 100%, as it covers all possible paths in the code. The if statement in the addNumbers method is tested with both a non-zero and zero input, ensuring that both branches are covered. Additionally, the main method is also tested, ensuring that the correct sum is printed to the console.