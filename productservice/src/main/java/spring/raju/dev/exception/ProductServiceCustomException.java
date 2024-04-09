package spring.raju.dev.exception;


public class ProductServiceCustomException extends RuntimeException{

	private String errorCode;

	 public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}



	    public ProductServiceCustomException(String message, String errorCode) {
	        super(message);
	        this.errorCode = errorCode;
	    }
}