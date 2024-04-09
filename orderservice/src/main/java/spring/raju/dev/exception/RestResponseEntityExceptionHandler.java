package spring.raju.dev.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import spring.raju.dev.response.ErrorResponse;
@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	public ResponseEntity<ErrorResponse> handleCustomException(OrderServiceCustomException exception){
		  return new ResponseEntity<>(new ErrorResponse().builder()
	                .errorMessage(exception.getMessage())
	                .errorCode(exception.getErrorCode())
	                .build(),
	                HttpStatus.valueOf(exception.getStatus()));
		
	}
}
