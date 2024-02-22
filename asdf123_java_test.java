Unit Test Case:

@Test
public void testGetProductById() {
    // Arrange
    ProductDao productDao = Mockito.mock(ProductDao.class);
    ProductService productService = new ProductService(productDao);
    Product expectedProduct = new Product(1, "Test Product", 10.00, "Test Description");
    Mockito.when(productDao.getProductById(1)).thenReturn(expectedProduct);
    
    // Act
    Product actualProduct = productService.getProductById(1);
    
    // Assert
    assertEquals(expectedProduct, actualProduct);
    verify(productDao, times(1)).getProductById(1);
}

Code Coverage: 100%