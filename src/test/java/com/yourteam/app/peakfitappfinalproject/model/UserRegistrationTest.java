package com.yourteam.app.peakfitappfinalproject.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for User registration.
 * Each test validates part of the registration functionality.
 * Author: Harry Moon
 */
public class UserRegistrationTest {

    @Test
    void validEmailPasses() {
        User u = new User("harry@example.com");
        Assertions.assertEquals("harry@example.com", u.getEmail());
    }

    @Test
    void invalidEmailThrows() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new User("bad-email")
        );
    }
}
