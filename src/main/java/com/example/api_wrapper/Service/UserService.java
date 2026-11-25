package com.example.api_wrapper.Service;


import com.example.api_wrapper.Model.User;
import com.example.api_wrapper.ThirdParty.UserIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserIntegration userIntegration;

    public User[] getUsers() {
        return userIntegration.getUsers();
    }

}
