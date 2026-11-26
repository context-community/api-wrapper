package com.example.api_wrapper.features.user;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService Userservice;

    @GetMapping("/users")
    public User[] getUsers() {

        return Userservice.getUsers();
    }


}
