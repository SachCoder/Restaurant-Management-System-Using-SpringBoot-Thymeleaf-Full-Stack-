package com.sachcoder.restaurantmanagementsystem.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.sachcoder.restaurantmanagementsystem.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LogoutHandler implements LogoutSuccessHandler {
    @Autowired
    UserService userService;
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        String username = ((CustomUserDetails) authentication.getPrincipal()).getUsername();

        userService.updateLogoutDate(username);

        httpServletRequest.logout();
        httpServletRequest.getSession().invalidate();
        httpServletResponse.sendRedirect("/login?logout");
    }
}
