package spring.raju.dev.response;

import java.time.Instant;

import lombok.Builder;

@Builder
public class PaymentResponse {
	private long paymentId;
	private String status;
	private Double paymentMode;
	private long amount;
	private Instant paymentDate;
	private long orderId;

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Double paymentMode) {
		this.paymentMode = paymentMode;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Instant getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Instant paymentDate) {
		this.paymentDate = paymentDate;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public PaymentResponse(long paymentId, String status, Double paymentMode, long amount, Instant paymentDate,
			long orderId) {
		super();
		this.paymentId = paymentId;
		this.status = status;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.orderId = orderId;
	}

	public PaymentResponse() {

	}
}
