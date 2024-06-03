package com.movie_booking.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
// @PreAuthorize("hasRole(Role.USER)")
public class UserController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello");
    }
}
