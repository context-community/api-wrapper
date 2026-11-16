package com.example.api_wrapper.RestClientConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class RestClientBean {

    @Bean
    public RestClient.Builder restClientBuilder(){
        return RestClient.builder();
    }

}
