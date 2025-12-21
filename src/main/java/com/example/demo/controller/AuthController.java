package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // POST /auth/register
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    // GET /auth/user/{id}
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return authService.getUser(id);
    }
}