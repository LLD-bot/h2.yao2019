package com.example.bcdemo.controller;

import com.example.bcdemo.entity.User;
import com.example.bcdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hjf
 * @date 2019/10/10 - 15:27
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userRepository.getOne(id);
    }
}
