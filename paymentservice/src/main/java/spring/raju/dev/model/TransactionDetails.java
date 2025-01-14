package spring.raju.dev.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "payment_tbl")
@Builder
public class TransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "ORDER_ID")
	private long orderId;

	@Column(name = "MODE")
	private Double paymentMode;

	@Column(name = "REFERENCE_NUMBER")
	private String referenceNumber;

	@Column(name = "PAYMENT_DATE")
	private Instant paymentDate;

	@Column(name = "STATUS")
	private String paymentStatus;

	@Column(name = "AMOUNT")
	private long amount;

	public TransactionDetails(long id, long orderId, Double paymentMode, String referenceNumber, Instant paymentDate,
			
			String paymentStatus, long amount) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.paymentMode = paymentMode;
		this.referenceNumber = referenceNumber;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
		this.amount = amount;
	}

	public TransactionDetails() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Double getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Double paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Instant getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Instant paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
}
