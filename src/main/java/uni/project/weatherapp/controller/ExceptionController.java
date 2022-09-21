package uni.project.weatherapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import uni.project.weatherapp.exceptions.ErrorMessage;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<ErrorMessage> notFoundException(HttpClientErrorException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessage(
                        HttpStatus.NOT_FOUND.toString(),
                        "Location not found! Try other name ;)",
                        LocalDateTime.now()));
    }
}
