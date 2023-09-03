package com.stage.userCrud.model;
import com.stage.usercrud.model.User;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User(25, "John", "Doe", 34567890, "Male", "123 Main St", "Engineer");
    }

    @Test
    void testGetAge() {
        assertEquals(25, user.getAge());
    }

    @Test
    void testSetAge() {
        user.setAge(30);
        assertEquals(30, user.getAge());
    }

    @Test
    void testGetFirstName() {
        assertEquals("John", user.getFirstName());
    }

    @Test
    void testSetFirstName() {
        user.setFirstName("Jane");
        assertEquals("Jane", user.getFirstName());
    }

    @Test
    void testGetLastName() {
        assertEquals("Doe", user.getLastName());
    }

    @Test
    void testSetLastName() {
        user.setLastName("Smith");
        assertEquals("Smith", user.getLastName());
    }

    @Test
    void testGetPhoneNumber() {
        assertEquals(34567890, user.getPhoneNumber());
    }

    @Test
    void testSetPhoneNumber() {
        user.setPhoneNumber(98765432);
        assertEquals(98765432, user.getPhoneNumber());
    }

    @Test
    void testGetGender() {
        assertEquals("Male", user.getGender());
    }

    @Test
    void testSetGender() {
        user.setGender("Female");
        assertEquals("Female", user.getGender());
    }

    @Test
    void testGetAddress() {
        assertEquals("123 Main St", user.getAddress());
    }

    @Test
    void testSetAddress() {
        user.setAddress("456 Elm St");
        assertEquals("456 Elm St", user.getAddress());
    }

    @Test
    void testGetOccupation() {
        assertEquals("Engineer", user.getOccupation());
    }

    @Test
    void testSetOccupation() {
        user.setOccupation("Teacher");
        assertEquals("Teacher", user.getOccupation());
    }



}
