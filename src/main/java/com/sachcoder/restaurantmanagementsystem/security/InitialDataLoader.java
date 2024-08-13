package com.sachcoder.restaurantmanagementsystem.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.sachcoder.restaurantmanagementsystem.data.UserRole;
import com.sachcoder.restaurantmanagementsystem.data.entity.user.Employee;
import com.sachcoder.restaurantmanagementsystem.dto.Address;
import com.sachcoder.restaurantmanagementsystem.dto.Name;
import com.sachcoder.restaurantmanagementsystem.dto.PhoneNumber;
import com.sachcoder.restaurantmanagementsystem.service.UserService;

@Component
public class InitialDataLoader {
    private UserService userService;

    @Autowired
    public InitialDataLoader(UserService userService) {
        this.userService = userService;

        createAdminAccount();
    }

    private void createAdminAccount() {
        if(userService.countAll() == 0) {
            Employee admin = new Employee( );

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

            admin.setName(new Name("admin", "admin"));
            admin.setEmail("admin@admin.com");
            admin.setPassword(encoder.encode("admin"));
            admin.setRole(UserRole.ADMIN);
            admin.getAddressList().add(new Address("example", "example"));
            admin.getPhoneNumbers().add(new PhoneNumber("example", "example"));
            admin.setJoinDate(new Date());
            admin.setSalary(1);
            admin.setDateOfBirth(new Date());

            userService.saveUser(admin);
        }
    }
}
