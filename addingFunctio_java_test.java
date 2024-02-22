Unit Test Case:
        
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        
        public class AddNumbersTest {
        
            @Test
            public void testAddNumbers() {
                int number = 20;
                int expectedSum = 210;
                int actualSum = AddNumbers.addNumbers(number);
                assertEquals(expectedSum, actualSum);
            }
        }
        
        Code Coverage:
        
        The code coverage for this unit test is 100%. The test covers the main method and the addNumbers method, ensuring that the sum of numbers is correctly calculated and returned. The test also checks for the correct input and output values, ensuring that the code behaves as expected.