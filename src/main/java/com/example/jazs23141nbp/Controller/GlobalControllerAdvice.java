package com.example.jazs23141nbp.Controller;

import com.example.jazs23141nbp.Model.Currency;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestControllerAdvice
public class GlobalControllerAdvice{

@ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<Currency> handleNotFound() {
    return ResponseEntity.notFound().build();
}
    @ExceptionHandler(HttpServerErrorException.InternalServerError.class)
    public ResponseEntity<Currency> handleNotFound502() {
        return ResponseEntity.status(502).build();
    }
}




