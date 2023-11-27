package com.example.jwtbased.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/secure")
public class SecureController {
    @GetMapping
    public ResponseEntity<String> secure() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
