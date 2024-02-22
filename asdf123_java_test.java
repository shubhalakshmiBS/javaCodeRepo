**Unit Test Case:**
```
@Test
public void testCalculateTax() {
    // Given
    double salary = 50000.0;
    double expectedTax = 7500.0;
    TaxCalculator taxCalculator = new TaxCalculator();

    // When
    double actualTax = taxCalculator.calculateTax(salary);

    // Then
    assertEquals(expectedTax, actualTax, 0);
}
```

**Code Coverage:**
```
Code coverage is 100% for the given code content.
```