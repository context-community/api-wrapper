package com.example.api_wrapper.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {

    private String streat;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
