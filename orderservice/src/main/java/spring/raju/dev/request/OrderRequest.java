package spring.raju.dev.request;

import lombok.Builder;

@Builder
public class OrderRequest {
	private long productId;
    private long totalAmount;
    private long quantity;
    private Double paymentMode;
    
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public Double getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(Double paymentMode) {
		this.paymentMode = paymentMode;
	}
	public OrderRequest(long productId, long totalAmount, long quantity, Double paymentMode) {
		super();
		this.productId = productId;
		this.totalAmount = totalAmount;
		this.quantity = quantity;
		this.paymentMode = paymentMode;
	}
	public OrderRequest() {
		
	}
}
