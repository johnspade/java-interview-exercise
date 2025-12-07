package com.example.userservice.controller;

import com.example.userservice.dto.User;
import com.example.userservice.dto.UserSummary;
import com.example.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}/summary")
    public ResponseEntity<UserSummary> getUserSummary(@PathVariable Long id) {
        UserSummary summary = userService.getUserSummary(id);
        return ResponseEntity.ok(summary);
    }
}
