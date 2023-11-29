package com.vhq.exception;

import org.springframework.http.HttpStatus;

public class ReportException extends BaseException {

    public ReportException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }

}
