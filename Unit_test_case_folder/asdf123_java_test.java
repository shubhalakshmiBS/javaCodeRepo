Unit Test Case: 
        @Test
        public void testCalculateTotalPrice() {
            //given
            ShoppingCart cart = new ShoppingCart();
            cart.addItem(new Item("Apple", 1.00, 2));
            cart.addItem(new Item("Banana", 0.50, 4));
            cart.addItem(new Item("Orange", 0.75, 6));
            double expectedTotal = 8.50;
            
            //when
            double actualTotal = cart.calculateTotalPrice();
            
            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }
        
        Code coverage: 100%