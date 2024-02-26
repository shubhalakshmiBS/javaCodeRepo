Unit Test Case:
        
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
        
        Code coverage: 100%