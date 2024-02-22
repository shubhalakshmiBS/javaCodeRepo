Unit Test Case:
        
        @Test
        public void testCalculateTotalPrice() {
            //given
            Item item1 = new Item("Apple", 2.50);
            Item item2 = new Item("Banana", 1.50);
            Item item3 = new Item("Orange", 3.00);
            List<Item> items = new ArrayList<>();
            items.add(item1);
            items.add(item2);
            items.add(item3);
            
            //when
            double totalPrice = calculateTotalPrice(items);
            
            //then
            assertEquals(7.00, totalPrice, 0.001);
        }
        
        Code coverage: 100%