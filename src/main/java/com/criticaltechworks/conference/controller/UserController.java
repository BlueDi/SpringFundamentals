package com.criticaltechworks.conference.controller;

import com.criticaltechworks.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Diogo") String firstName,
                        @RequestParam(value = "lastname", defaultValue = "Cruz") String lastName,
                        @RequestParam(value = "age", defaultValue = "28") int age) {
        //This would be were the Service would call the database.
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println(user);
        return user;
    }
}
