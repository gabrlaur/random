package com.gabrlaur.random.controller;

import com.gabrlaur.random.entity.User;
import com.gabrlaur.random.enums.Email;
import com.gabrlaur.random.enums.FirstName;
import com.gabrlaur.random.enums.LastName;
import com.gabrlaur.random.repository.UserRepository;
import com.gabrlaur.random.service.UserService;
import com.gabrlaur.random.utils.RandomUtils;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/user")
@Transactional
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/random")
    public User getRandomUser() {
        return userService.getRandomUser();
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public User createRandomUser() {
        return userService.createRandomUser();
    }
}
