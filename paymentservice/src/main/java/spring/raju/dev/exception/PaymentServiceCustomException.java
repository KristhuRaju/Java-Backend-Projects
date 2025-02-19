package spring.raju.dev.exception;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class PaymentServiceCustomException extends RuntimeException {

	private final String errorCode;

	public PaymentServiceCustomException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

}
