package com.isrdc.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(exception = NullPointerException.class)
	public ResponseEntity<ExceptionInfo> nullExceptionHandler(NullPointerException e) {
		
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		
		exceptionInfo.setExceptionCode("Ex00123");
		exceptionInfo.setExceptionMessage(e.getMessage());
		exceptionInfo.setExceptionDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(exceptionInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(exception = UserNotFoundException.class)
	public ResponseEntity<ExceptionInfo> userNotFoundExceptionHandler(UserNotFoundException e) {
		
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		
		exceptionInfo.setExceptionCode("Ex00432");
		exceptionInfo.setExceptionMessage(e.getMessage());
		exceptionInfo.setExceptionDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(exceptionInfo, HttpStatus.BAD_REQUEST);
	}
	
	
}
