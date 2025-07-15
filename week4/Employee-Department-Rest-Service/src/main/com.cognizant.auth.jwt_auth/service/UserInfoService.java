package com.cognizant.auth.jwt_auth.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserInfoService implements UserDetailsService {

    // In real apps, load from DB. Here it's hardcoded for demo
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("admin")) {
            return new User("admin", "$2a$10$uIEXw5vKnwJbyRr7P0OZ6eM79wHgQcrnDf0jVi17vmsFxyU1XZCTW", Collections.emptyList());
            // Password is "admin" (BCrypt encoded)
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
