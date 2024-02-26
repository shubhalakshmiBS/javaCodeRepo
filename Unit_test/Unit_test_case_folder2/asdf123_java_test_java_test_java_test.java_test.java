@Test
        public void testCalculateTotalPriceWithMultipleItems() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item1 = new Item("Shirt", 25.00);
            Item item2 = new Item("Pants", 35.00);
            cart.addItem(item1);
            cart.addItem(item2);
            double expectedTotal = 60.00;

            //when
            double actualTotal = cart.calculateTotalPrice();

            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }

        Code coverage: 100%