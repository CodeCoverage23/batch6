package com.management.user.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
      public ResponseEntity<ApiResponse> resourceNotFound(ResourceNotFoundException ex){
		
		
		
		
	}
	
	
	
	
	
}
