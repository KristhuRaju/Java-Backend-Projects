package spring.raju.dev.service;

import spring.raju.dev.request.PaymentRequest;
import spring.raju.dev.response.PaymentResponse;

public interface paymentservice {

	 long doPayment(PaymentRequest paymentRequest);

	    PaymentResponse getPaymentDetailsByOrderId(long orderId); 
}
