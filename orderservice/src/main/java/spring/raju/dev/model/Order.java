package spring.raju.dev.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Builder
@Entity
@Table(name="order_tbl")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "QUANTITY")
    private long quantity;

    @Column(name = "ORDER_DATE")
    private Instant orderDate;

    @Column(name = "STATUS")
    private String orderStatus;

    @Column(name = "TOTAL_AMOUNT")
    private long amount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Order(long id, long productId, long quantity, Instant orderDate, String orderStatus, long amount) {
		super();
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.amount = amount;
	}
	public Order() {
		
	}

	
}
