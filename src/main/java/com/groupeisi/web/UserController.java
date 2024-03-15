package com.groupeisi.web;

import com.groupeisi.entity.User;
import com.groupeisi.service.UserService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    @RolesAllowed("user")
    public ResponseEntity<User> getUser(@PathVariable int userId) {
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @GetMapping
    @RolesAllowed("admin")
    public ResponseEntity<List<User>> findALlUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

}
