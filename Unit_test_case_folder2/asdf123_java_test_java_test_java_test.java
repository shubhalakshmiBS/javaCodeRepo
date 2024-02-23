@Test
        public void testCalculateTotalPriceWithOneItem() {
            //given
            ShoppingCart cart = new ShoppingCart();
            Item item = new Item("Shirt", 25.00);
            cart.addItem(item);
            double expectedTotal = 25.00;

            //when
            double actualTotal = cart.calculateTotalPrice();

            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }

        Code coverage: 100%