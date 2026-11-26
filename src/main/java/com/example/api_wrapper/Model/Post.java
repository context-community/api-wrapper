package com.example.api_wrapper.Model;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Post {
    private int id;
    private int userId;
    private String title;
    private String body;

}
