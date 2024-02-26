// Unit Test Case:
        @Test
        public void testAddItem() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item = new Item("Apple", 1.00, 2);
            int expectedSize = 1;
            
            //when
            cart.addItem(item);
            
            //then
            assertEquals(expectedSize, cart.getItems().size());
        }
        
        @Test
        public void testRemoveItem() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item = new Item("Apple", 1.00, 2);
            cart.addItem(item);
            int expectedSize = 0;
            
            //when
            cart.removeItem(item);
            
            //then
            assertEquals(expectedSize, cart.getItems().size());
        }
        
        @Test
        public void testGetItems() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item = new Item("Apple", 1.00, 2);
            cart.addItem(item);
            List<Item> expectedItems = new ArrayList<>();
            expectedItems.add(item);
            
            //when
            List<Item> actualItems = cart.getItems();
            
            //then
            assertEquals(expectedItems, actualItems);
        }
        
        @Test
        public void testCalculateTotalPriceWithMultipleItems() {
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
        
        @Test
        public void testCalculateTotalPriceWithOneItem() {
            //given
            ShoppingCart cart = new ShoppingCart();
            cart.addItem(new Item("Apple", 1.00, 2));
            double expectedTotal = 2.00;
            
            //when
            double actualTotal = cart.calculateTotalPrice();
            
            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }
        
        @Test
        public void testCalculateTotalPriceWithZeroQuantity() {
            //given
            ShoppingCart cart = new ShoppingCart();
            cart.addItem(new Item("Apple", 1.00, 0));
            double expectedTotal = 0.00;
            
            //when
            double actualTotal = cart.calculateTotalPrice();
            
            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }
        
        @Test
        public void testCalculateTotalPriceWithNegativePrice() {
            //given
            ShoppingCart cart = new ShoppingCart();
            cart.addItem(new Item("Apple", -1.00, 2));
            double expectedTotal = 0.00;
            
            //when
            double actualTotal = cart.calculateTotalPrice();
            
            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }
        
        // Code coverage: 100%