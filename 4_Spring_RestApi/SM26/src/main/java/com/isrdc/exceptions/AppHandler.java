package com.isrdc.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppHandler {
	@ExceptionHandler(exception = Exception.class)
	public ResponseEntity<ExceptionInfo> exceptionHandler(Exception e) {
		ExceptionInfo exInfo = new ExceptionInfo();
		
		exInfo.setExceptionCode("EX00012");
		exInfo.setExceptionMsg(e.getMessage());
		exInfo.setExceptionDT(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionInfo>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(exception = {NullPointerException.class, ArithmeticException.class})
	public ResponseEntity<ExceptionInfo> exceptionNullHandler(Exception e) {
		ExceptionInfo exInfo = new ExceptionInfo();
		
		exInfo.setExceptionCode("EX00021");
		exInfo.setExceptionMsg(e.getMessage());
		exInfo.setExceptionDT(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionInfo>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
