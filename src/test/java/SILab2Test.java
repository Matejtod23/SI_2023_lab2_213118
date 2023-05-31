import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private SILab2 function = new SILab2();



    @Test
    public void testNullUser() {
        List<User> allUsers = new ArrayList<>();
        Assertions.assertThrows(RuntimeException.class, () -> function.function(null, allUsers));
    }

    @Test
    public void testInvalidEmail() {
        User user = new User("TestOne", "password123", "invalidemail");
        List<User> allUsers = new ArrayList<>();
        Assertions.assertFalse(function.function(user, allUsers));
    }

    @Test
    public void testEmailOrUsernameAlreadyTaken() {
        User user = new User("TestOne", "password", "existingemail@example.com");
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("other", "password", "existingemail@example.com"));
        Assertions.assertFalse(function.function(user, allUsers));
    }

    @Test
    public void testPasswordContainsUsername() {
        User user = new User("testone", "testone123", "testone@gmail.com");
        List<User> allUsers = new ArrayList<>();
        Assertions.assertFalse(function.function(user, allUsers));
    }

    @Test
    public void testValidPassword() {
        User user = new User("TestOne", "Password123@", "testone@gmail.com");
        List<User> allUsers = new ArrayList<>();
        Assertions.assertTrue(function.function(user, allUsers));
    }
}