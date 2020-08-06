package com.capg.assignment.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.capg.assignment.exception.InvalidDobException;
import com.capg.assignment.exception.StudentAlreadyExists;
import com.capg.assignment.exception.StudentNotFoundException;
import com.capg.assignment.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {StudentAlreadyExists.class,StudentNotFoundException.class})
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex, HttpServletRequest req)
	{
		return new ErrorResponse(new Date(), ex.getMessage(), 
	
				HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_GATEWAY.value(), req.getRequestURI());
	}
	
	@ResponseStatus(code=HttpStatus.EXPECTATION_FAILED)
	@ExceptionHandler(value = {InvalidDobException.class})
	public ErrorResponse invalidDob(Exception e,HttpServletRequest req)
	{
		return new ErrorResponse(new Date(), e.getMessage(), HttpStatus.EXPECTATION_FAILED.getReasonPhrase(), HttpStatus.BAD_GATEWAY.value(), req.getRequestURI());
		
	}
	
}
