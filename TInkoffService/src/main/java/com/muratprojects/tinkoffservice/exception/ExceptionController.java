package com.muratprojects.tinkoffservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler({StockNotFoundException.class})
    
}
