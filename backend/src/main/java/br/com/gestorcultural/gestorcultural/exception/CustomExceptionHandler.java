package br.com.gestorcultural.gestorcultural.exception;

import br.com.gestorcultural.gestorcultural.exception.badrequest.BadRequestException;
import br.com.gestorcultural.gestorcultural.exception.notfound.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException exception) {
        Map<String, String> errorMap = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error ->
        {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequestException.class)
    public Map<String, String> handleBadRequest(BadRequestException exception) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("message", exception.getMessage());
        return errorMap;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public Map<String, String> handleNotFoundException(NotFoundException exception) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("message", exception.getMessage());
        return errorMap;
    }
}
