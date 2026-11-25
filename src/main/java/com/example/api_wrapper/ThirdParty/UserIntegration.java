package com.example.api_wrapper.ThirdParty;

import com.example.api_wrapper.Model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class UserIntegration {
    private final ThirdPartyCallerService thirdPartyCallerService;

    public User[] getUsers() {
        return thirdPartyCallerService.getRequest("users", new ParameterizedTypeReference<User[]>() {
        });
    }
}
