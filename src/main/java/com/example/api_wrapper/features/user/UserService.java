package com.example.api_wrapper.features.user;


import com.example.api_wrapper.ThirdParty.UserIntegration;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserIntegration userIntegration;

    public UserService(UserIntegration userIntegration) {
        this.userIntegration = userIntegration;
    }

    public User[] getUsers() {

        return userIntegration.getUsers();

    }


}
