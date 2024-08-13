package com.sachcoder.restaurantmanagementsystem.util;

import com.sachcoder.restaurantmanagementsystem.data.entity.user.Employee;
import com.sachcoder.restaurantmanagementsystem.dto.UserDTO;
import com.sachcoder.restaurantmanagementsystem.service.UserService;

public class UserUtils {
    private UserUtils() {}

    public static UserDTO getUserData(UserService userService, String email) {
        Employee user = userService.getUserByEmail(email);

        UserDTO userData = userService.getUserFromEntity(user);

        return userData;
    }
}
