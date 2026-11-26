package com.example.api_wrapper.ThirdParty;

import com.example.api_wrapper.features.user.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;


@Component
public class UserIntegration extends CallThirdPartyProvider {
    public UserIntegration(RestClient.Builder builder) {
        super(builder);
    }

    public User[] getUsers() {
        return this.makeGetRequest("users", new ParameterizedTypeReference<User[]>() {
        });
    }

}
