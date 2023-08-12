package com.ivdev.junit.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserServiceTest {

    @Test
    void userEmptyIfNoUsersAdded() {
        var userService = new UserService();
        var users = userService.getAll();
        assertTrue(users.isEmpty());
    }
}
