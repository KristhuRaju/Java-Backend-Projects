package spring.raju.dev.response;

import java.time.Instant;

import lombok.Builder;
@Builder
public class OrderResponse {

	   private long orderId;
	    private Instant orderDate;
	    private String orderStatus;
	    private long amount;
	    private ProductDetails productDetails;
	    private PaymentDetails paymentDetails;

public long getOrderId() {
			return orderId;
		}
		public void setOrderId(long orderId) {
			this.orderId = orderId;
		}
		public Instant getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(Instant orderDate) {
			this.orderDate = orderDate;
		}
		public String getOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		public long getAmount() {
			return amount;
		}
		public void setAmount(long amount) {
			this.amount = amount;
		}
		public ProductDetails getProductDetails() {
			return productDetails;
		}
		public void setProductDetails(ProductDetails productDetails) {
			this.productDetails = productDetails;
		}
		public PaymentDetails getPaymentDetails() {
			return paymentDetails;
		}
		public void setPaymentDetails(PaymentDetails paymentDetails) {
			this.paymentDetails = paymentDetails;
		}
		
public OrderResponse(long orderId, Instant orderDate, String orderStatus, long amount,
				ProductDetails productDetails, PaymentDetails paymentDetails) {
			super();
			this.orderId = orderId;
			this.orderDate = orderDate;
			this.orderStatus = orderStatus;
			this.amount = amount;
			this.productDetails = productDetails;
			this.paymentDetails = paymentDetails;
		}
public OrderResponse() {
	
}
@Builder
public static class ProductDetails {
	private String productName;
    private long productId;
    private long quantity;
    private long price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public ProductDetails(String productName, long productId, long quantity, long price) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
	public ProductDetails() {
		
	}
    
}
@Builder
public static class PaymentDetails{
	private long paymentId;
    private Double paymentMode;
    private String paymentStatus;
    private Instant paymentDate;
    
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public Double getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(Double paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Instant getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Instant paymentDate) {
		this.paymentDate = paymentDate;
	}
	public PaymentDetails(long paymentId, Double paymentMode, String paymentStatus, Instant paymentDate) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
	}
	public PaymentDetails() {
		
	}
	
}
}