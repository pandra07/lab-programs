package com.capg.demo.productdb.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.productdb.exception.ProductAlreadyExistsException;
import com.capg.demo.productdb.exception.ProductDoesnotExistException;
import com.capg.demo.productdb.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler(value={ProductAlreadyExistsException.class})
	public ErrorResponse handleProductAlreadyExistsException(Exception ex,HttpServletRequest req)
	{
		return new ErrorResponse(new Date(),ex.getMessage(),
				HttpStatus.FORBIDDEN.getReasonPhrase(), HttpStatus.FORBIDDEN.value(), req.getRequestURI());
	}
@ResponseStatus(HttpStatus.BAD_REQUEST)
@ExceptionHandler(value= {ProductDoesnotExistException.class})
public ErrorResponse handleProductDoesnotExistException(Exception ex,HttpServletRequest req)
{
	return new ErrorResponse(new Date(),ex.getMessage(),HttpStatus.BAD_REQUEST.getReasonPhrase(),HttpStatus.BAD_REQUEST.ordinal(),req.getRequestURI().toString());
}
}
