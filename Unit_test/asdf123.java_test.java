**Unit Test Case:**

```
@Test
public void testGetUser() {
    // Given
    User user = new User("John", "Doe", "johndoe@gmail.com");
    UserRepository userRepository = Mockito.mock(UserRepository.class);
    Mockito.when(userRepository.getUser("johndoe@gmail.com")).thenReturn(user);
    UserService userService = new UserService(userRepository);
    
    // When
    User result = userService.getUser("johndoe@gmail.com");
    
    // Then
    Assert.assertEquals("John", result.getFirstName());
    Assert.assertEquals("Doe", result.getLastName());
    Assert.assertEquals("johndoe@gmail.com", result.getEmail());
    Mockito.verify(userRepository, Mockito.times(1)).getUser("johndoe@gmail.com");
}
```

**Code Coverage:**

The above unit test covers the following code:

- UserService class
  - getUser() method
- UserRepository class
  - getUser() method