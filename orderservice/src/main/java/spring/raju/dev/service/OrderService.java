package spring.raju.dev.service;

import spring.raju.dev.request.OrderRequest;
import spring.raju.dev.response.OrderResponse;

public interface OrderService {
	long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
