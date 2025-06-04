package tech.kianseong.coffeebook.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<String> register() {
        return ResponseEntity.ok("registration success");
    }
    
}
