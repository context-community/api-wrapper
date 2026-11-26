package com.example.api_wrapper.features.user;


import com.example.api_wrapper.Model.Address;
import com.example.api_wrapper.Model.Company;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String email;

    private Address address;
    private String phone;
    private String website;
    private Company company;

}


