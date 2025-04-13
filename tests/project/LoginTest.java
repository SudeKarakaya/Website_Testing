package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    @Test
    void loginTrue() {
        String email = "ayvaogluayva@gmail.com";
        String password = "ayvaAyva1.";
        assertTrue(Login.login(email, password));
    }

    @Test
    void loginFalse(){
        String email = "ayvaay@gmail.com";
        String password = "ayvaAyva";
        assertFalse(Login.login(email, password));
    }
}



