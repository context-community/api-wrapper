package com.example.api_wrapper.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Comment {

    private int id;
    private int postId;
    private String name;
    private String email;
    private String body;

}
