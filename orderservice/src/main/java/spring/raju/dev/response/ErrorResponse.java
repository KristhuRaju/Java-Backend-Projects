package spring.raju.dev.response;

import lombok.Builder;

@Builder
public class ErrorResponse {
	private String errorMessage;
    private String errorCode;
    
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public ErrorResponse(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	public ErrorResponse() {
		
	}
}
