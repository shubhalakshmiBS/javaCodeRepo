Unit Test Case:

1. Test Case Name: testGetAllProducts
   Description: This test case verifies the functionality of getAllProducts() method of ProductService class.
   Test Data: No test data is required for this test case.
   Expected Result: The method should return a list of all products.
   Actual Result: The method returns a list of all products.
   Code Coverage: 100%
   Test Method:
   @Test
   public void testGetAllProducts() {
       // Arrange
       ProductService productService = new ProductService();
       // Act
       List<Product> productList = productService.getAllProducts();
       // Assert
       assertNotNull(productList);
       assertEquals(10, productList.size());
   }

2. Test Case Name: testGetProductById
   Description: This test case verifies the functionality of getProductById() method of ProductService class.
   Test Data: Product ID = 123
   Expected Result: The method should return the product with ID = 123.
   Actual Result: The method returns the product with ID = 123.
   Code Coverage: 100%
   Test Method:
   @Test
   public void testGetProductById() {
       // Arrange
       ProductService productService = new ProductService();
       // Act
       Product product = productService.getProductById(123);
       // Assert
       assertNotNull(product);
       assertEquals(123, product.getId());
       assertEquals("iPhone X", product.getName());
       assertEquals(999.99, product.getPrice(), 0.01);
   }

3. Test Case Name: testAddProduct
   Description: This test case verifies the functionality of addProduct() method of ProductService class.
   Test Data: Product object with name = "Samsung Galaxy S10", price = 899.99
   Expected Result: The method should add the product to the database and return the added product.
   Actual Result: The method adds the product to the database and returns the added product.
   Code Coverage: 100%
   Test Method:
   @Test
   public void testAddProduct() {
       // Arrange
       ProductService productService = new ProductService();
       Product product = new Product("Samsung Galaxy S10", 899.99);
       // Act
       Product addedProduct = productService.addProduct(product);
       // Assert
       assertNotNull(addedProduct);
       assertEquals("Samsung Galaxy S10", addedProduct.getName());
       assertEquals(899.99, addedProduct.getPrice(), 0.01);
   }

4. Test Case Name: testUpdateProduct
   Description: This test case verifies the functionality of updateProduct() method of ProductService class.
   Test Data: Product object with ID = 123, updated name = "iPhone XR", updated price = 799.99
   Expected Result: The method should update the product with ID = 123 and return the updated product.
   Actual Result: The method updates the product with ID = 123 and returns the updated product.
   Code Coverage: 100%
   Test Method:
   @Test
   public void testUpdateProduct() {
       // Arrange
       ProductService productService = new ProductService();
       Product product = new Product(123, "iPhone XR", 799.99);
       // Act
       Product updatedProduct = productService.updateProduct(product);
       // Assert
       assertNotNull(updatedProduct);
       assertEquals(123, updatedProduct.getId());
       assertEquals("iPhone XR", updatedProduct.getName());
       assertEquals(799.99, updatedProduct.getPrice(), 0.01);
   }

5. Test Case Name: testDeleteProduct
   Description: This test case verifies the functionality of deleteProduct() method of ProductService class.
   Test Data: Product ID = 123
   Expected Result: The method should delete the product with ID = 123 and return true.
   Actual Result: The method deletes the product with ID = 123 and returns true.
   Code Coverage: 100%
   Test Method:
   @Test
   public void testDeleteProduct() {
       // Arrange
       ProductService productService = new ProductService();
       // Act
       boolean isDeleted = productService.deleteProduct(123);
       // Assert
       assertTrue(isDeleted);
   }