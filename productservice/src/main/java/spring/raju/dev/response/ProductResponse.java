package spring.raju.dev.response;

import lombok.Builder;

@Builder 
public class ProductResponse {
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
	public ProductResponse(String productName, long productId, long quantity, long price) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
	public ProductResponse() {
		
	}
	private String productName;
    private long productId;
    private long quantity;
    private long price;
}
