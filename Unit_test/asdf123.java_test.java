Unit Test Case: 
        @Test
        public void testGetAverage() {
            int[] nums = {5, 10, 15, 20};
            double expected = 12.5;
            double actual = getAverage(nums);
            assertEquals(expected, actual, 0.001);
        }
        
        @Test
        public void testGetAverageEmptyArray() {
            int[] nums = {};
            double expected = 0.0;
            double actual = getAverage(nums);
            assertEquals(expected, actual, 0.001);
        }
        
        @Test
        public void testGetAverageNegativeNumbers() {
            int[] nums = {-5, -10, -15, -20};
            double expected = -12.5;
            double actual = getAverage(nums);
            assertEquals(expected, actual, 0.001);
        }
        
        @Test
        public void testGetAverageMixedNumbers() {
            int[] nums = {-5, 10, -15, 20};
            double expected = 2.5;
            double actual = getAverage(nums);
            assertEquals(expected, actual, 0.001);
        }
        
        @Test
        public void testGetAverageSingleNumber() {
            int[] nums = {5};
            double expected = 5.0;
            double actual = getAverage(nums);
            assertEquals(expected, actual, 0.001);
        }
        
        @Test
        public void testGetAverageNullArray() {
            int[] nums = null;
            double expected = 0.0;
            double actual = getAverage(nums);
            assertEquals(expected, actual, 0.001);
        }
        
        Code coverage: 100%