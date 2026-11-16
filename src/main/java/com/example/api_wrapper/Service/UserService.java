package com.example.api_wrapper.Service;


import com.example.api_wrapper.Model.Post;
import com.example.api_wrapper.Model.User;
import com.example.api_wrapper.ThirdParty.ThirdParty;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final ThirdParty thirdParty;

    public UserService(ThirdParty thirdParty){
        this.thirdParty = thirdParty;
    }

    public User[] getUsers() {

        return thirdParty.getUsers();

    }


}
