package com.stage.userCrud.model;
import com.stage.usercrud.model.User;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User(25, "John", "Doe", 34567890, "Male", "123 Main St", "Engineer");
    }

    @Test
    public void testGetAge() {
        assertEquals(25, user.getAge());
    }

    @Test
    public void testSetAge() {
        user.setAge(30);
        assertEquals(30, user.getAge());
    }

    @Test
    public void testGetFirstName() {
        assertEquals("John", user.getFirstName());
    }

    @Test
    public void testSetFirstName() {
        user.setFirstName("Jane");
        assertEquals("Jane", user.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Doe", user.getLastName());
    }

    @Test
    public void testSetLastName() {
        user.setLastName("Smith");
        assertEquals("Smith", user.getLastName());
    }

    @Test
    public void testGetPhoneNumber() {
        assertEquals(34567890, user.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumber() {
        user.setPhoneNumber(98765432);
        assertEquals(98765432, user.getPhoneNumber());
    }

    @Test
    public void testGetGender() {
        assertEquals("Male", user.getGender());
    }

    @Test
    public void testSetGender() {
        user.setGender("Female");
        assertEquals("Female", user.getGender());
    }

    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", user.getAddress());
    }

    @Test
    public void testSetAddress() {
        user.setAddress("456 Elm St");
        assertEquals("456 Elm St", user.getAddress());
    }

    @Test
    public void testGetOccupation() {
        assertEquals("Engineer", user.getOccupation());
    }

    @Test
    public void testSetOccupation() {
        user.setOccupation("Teacher");
        assertEquals("Teacher", user.getOccupation());
    }



}
