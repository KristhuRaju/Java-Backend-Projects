package spring.raju.dev.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import spring.raju.dev.exception.PaymentServiceCustomException;
import spring.raju.dev.model.TransactionDetails;
import spring.raju.dev.repo.TransactionDetailsRepository;
import spring.raju.dev.request.PaymentRequest;
import spring.raju.dev.response.PaymentResponse;

@Service
@Log4j2
public class PaymentServiceImpl implements paymentservice {
	@Autowired
	private TransactionDetailsRepository transactionDetailsRepository;
	@Override
	public long doPayment(PaymentRequest paymentRequest) {
		log.info("PaymentServiceImpl | doPayment is called");

        log.info("PaymentServiceImpl | doPayment | Recording Payment Details: {}", paymentRequest);
        
        TransactionDetails transactionDetails= TransactionDetails.builder()
        										.paymentDate(Instant.now())
        										.paymentMode(paymentRequest.getPaymentMode())
        										.paymentStatus("Success")
        										.orderId(paymentRequest.getOrderId())
        										.referenceNumber(paymentRequest.getReferenceNumber())
        										.amount(paymentRequest.getAmount())
        										.build();
        transactionDetails=transactionDetailsRepository.save(transactionDetails);
        log.info("Transaction Completed with Id: {}", transactionDetails.getId());
        
        										
		return transactionDetails.getId();
	}

	@Override
	public PaymentResponse getPaymentDetailsByOrderId(long orderId) {
        log.info("PaymentServiceImpl | getPaymentDetailsByOrderId is called");

        log.info("PaymentServiceImpl | getPaymentDetailsByOrderId | Getting payment details for the Order Id: {}", orderId);
        
        TransactionDetails transactionDetails =transactionDetailsRepository.findByOrderId(orderId)
        										.orElseThrow(() -> new PaymentServiceCustomException(
        												"TransactionDetails with given id not found",
        						                        "TRANSACTION_NOT_FOUND"));
        
			PaymentResponse paymentResponse= PaymentResponse.builder()
					//paymentId(TransactionDetails.getPaymentId())
					//.paymentMode(PaymentResponse.valueOf(transactionDetails.getPaymentMode()))
					.paymentDate(transactionDetails.getPaymentDate())
					.orderId(transactionDetails.getOrderId())
					.status(transactionDetails.getPaymentStatus())
					.amount(transactionDetails.getAmount())
					.build();
			log.info("PaymentServiceImpl | getPaymentDetailsByOrderId | paymentResponse: {}", paymentResponse.toString());

	        return paymentResponse;
        
			}

}
