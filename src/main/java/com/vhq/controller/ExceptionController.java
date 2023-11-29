package com.vhq.controller;

import com.vhq.exception.ErrorResponse;
import com.vhq.exception.ReportException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ReportException.class)
    public ResponseEntity<ErrorResponse> serviceNotFound(HttpServletRequest  request, ReportException ex){
        ErrorResponse errorResponse = new ErrorResponse(ex.getLocalizedMessage(), request.getRequestURL().toString());
        return new ResponseEntity<>(errorResponse,  ex.getHttpStatus());
    }

}
