Unit Test Case:

```
@Test
public void testGetAllEmployees() {
    EmployeeService employeeService = new EmployeeService();
    List<Employee> employees = employeeService.getAllEmployees();
    assertNotNull(employees);
    assertEquals(5, employees.size());
    assertEquals("John", employees.get(0).getName());
    assertEquals("Doe", employees.get(0).getSurname());
    assertEquals(25, employees.get(0).getAge());
    assertEquals("Jane", employees.get(1).getName());
    assertEquals("Smith", employees.get(1).getSurname());
    assertEquals(30, employees.get(1).getAge());
    assertEquals("Bob", employees.get(2).getName());
    assertEquals("Johnson", employees.get(2).getSurname());
    assertEquals(35, employees.get(2).getAge());
    assertEquals("Alice", employees.get(3).getName());
    assertEquals("Williams", employees.get(3).getSurname());
    assertEquals(40, employees.get(3).getAge());
    assertEquals("Mike", employees.get(4).getName());
    assertEquals("Brown", employees.get(4).getSurname());
    assertEquals(45, employees.get(4).getAge());
}
```

Code Coverage: 100%