 package spring.raju.dev.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import spring.raju.dev.response.ErrorResponse;
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	public ResponseEntity<ErrorResponse> handleProductServiceException(PaymentServiceCustomException exception){
		return new ResponseEntity<>(ErrorResponse.builder()
				.errorMessage(exception.getMessage())
				.errorCode(exception.getErrorCode())
				.build(),HttpStatus.NOT_FOUND);
	}
}
