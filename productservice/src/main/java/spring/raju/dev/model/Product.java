package spring.raju.dev.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name="Product_tbl")
@Builder
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	@Column(name = "PRODUCT_NAME")	
	private String productName;
	
	@Column(name = "PRICE")
	private long price;
	
	@Column(name = "QUANTITY")
	private long quantity;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Product(long productId, String productName, long price, long quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		
	}

}
