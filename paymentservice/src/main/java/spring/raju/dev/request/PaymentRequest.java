package spring.raju.dev.request;

import lombok.Builder;

@Builder
public class PaymentRequest {
	private long orderId;
	private long amount;
	private String referenceNumber;
	private Double paymentMode;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Double getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Double paymentMode) {
		this.paymentMode = paymentMode;
	}

	public PaymentRequest(long orderId, long amount, String referenceNumber, Double paymentMode) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.referenceNumber = referenceNumber;
		this.paymentMode = paymentMode;
	}

	public PaymentRequest() {

	}

}
