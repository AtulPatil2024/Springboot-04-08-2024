package com.mobis.demo.globalexception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mobis.demo.exception.ResourceNotFoundException;

@ControllerAdvice
public class EmployeeExceptionController {
	

	@ExceptionHandler(value = ResourceNotFoundException.class)
		
		public ResponseEntity<String> resourseNotFound(ResourceNotFoundException resourceNotFoundException){
			
			return new ResponseEntity<String>("Id not found", HttpStatus.BAD_REQUEST);
		
		}
		
		
	}


