package com.example.api_wrapper.Service;

import com.example.api_wrapper.Model.User;
import com.example.api_wrapper.ThirdParty.ThirdParty;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    ThirdParty thirdParty;

    @InjectMocks
    UserService userService;

    @Test
    void getUsersTest(){

        User[] users = {
                new User(),
                new User()
        };

        Mockito.when(thirdParty.getUsers()).thenReturn(users);

        User[] result = userService.getUsers();

        assertArrayEquals(users,result);

        Mockito.verify(thirdParty).getUsers();
    }

}
