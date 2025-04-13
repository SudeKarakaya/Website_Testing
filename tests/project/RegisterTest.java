package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void register() {
        String name = "Ayva";
        String surname = "Ayvaoğlu";
        String email = "ayvaogluayva@gmail.com";
        String telephone = "05385676045";
        String password = "ayvaAyva1.";
        assertFalse(Register.register(name, surname, email, telephone, password));

    }

}