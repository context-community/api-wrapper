package com.example.api_wrapper.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

@RestControllerAdvice
public class GlobslExceptionHandler {

    @ExceptionHandler(ResourceAccessException.class)
    public ResponseEntity<String> HandleConnectionError(ResourceAccessException r){

        //System.out.println(r.getMessage());

        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("the Service is not available!");

    }

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<String> HandleClientError(HttpClientErrorException c){

        return ResponseEntity.status(c.getStatusCode())
                .body("The Rescource is not found");

    }

}
