@Test
        public void testCalculateTotalPriceWithMultipleItems() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item1 = new Item("Shirt", 25.00);
            Item item2 = new Item("Pants", 35.00);
            Item item3 = new Item("Shoes", 50.00);
            cart.addItem(item1);
            cart.addItem(item2);
            cart.addItem(item3);
            double expectedTotal = 110.00;

            //when
            double actualTotal = cart.calculateTotalPrice();

            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }

        @Test
        public void testCalculateTotalPriceWithNoItems() {
            //given
            ShoppingCart cart = new ShoppingCart();
            double expectedTotal = 0.00;

            //when
            double actualTotal = cart.calculateTotalPrice();

            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }

        @Test
        public void testCalculateTotalPriceWithOneItem() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item1 = new Item("Shirt", 25.00);
            cart.addItem(item1);
            double expectedTotal = 25.00;

            //when
            double actualTotal = cart.calculateTotalPrice();

            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }

        @Test
        public void testCalculateTotalPriceWithDuplicateItems() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item1 = new Item("Shirt", 25.00);
            cart.addItem(item1);
            cart.addItem(item1);
            double expectedTotal = 50.00;

            //when
            double actualTotal = cart.calculateTotalPrice();

            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }

        Code coverage: 100%