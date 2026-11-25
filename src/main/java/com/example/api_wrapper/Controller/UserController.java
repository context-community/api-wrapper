package com.example.api_wrapper.Controller;


import com.example.api_wrapper.Model.User;
import com.example.api_wrapper.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class UserController {

    @Autowired
    UserService Userservice;


    @GetMapping("/users")
    public User[] getUsers() {

        return Userservice.getUsers();
    }


}
