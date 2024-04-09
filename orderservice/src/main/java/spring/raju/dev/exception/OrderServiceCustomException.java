package spring.raju.dev.exception;

public class OrderServiceCustomException extends RuntimeException{
	   private String errorCode;
	    private int status;
	    
		public String getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public OrderServiceCustomException(String message, String errorCode, int status) {
			super(message);
			this.errorCode = errorCode;
			this.status = status;
		}
		public OrderServiceCustomException() {
			
		}
		
}
