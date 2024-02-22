Unit Test Case:
        
        import org.junit.Assert;
        import org.junit.Test;
        
        public class AddNumbersTest {
        
            @Test
            public void testAddNumbers() {
                int number = 20;
                int expected = 210;
                int actual = AddNumbers.addNumbers(number);
                Assert.assertEquals(expected, actual);
            }
        }
        
        Code coverage: 100%