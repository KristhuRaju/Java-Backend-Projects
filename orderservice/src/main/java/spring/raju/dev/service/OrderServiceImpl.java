package spring.raju.dev.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j2;
import spring.raju.dev.exception.OrderServiceCustomException;
import spring.raju.dev.model.Order;
import spring.raju.dev.repo.OrderRepository;
import spring.raju.dev.request.OrderRequest;
import spring.raju.dev.request.PaymentRequest;
import spring.raju.dev.response.OrderResponse;
import spring.raju.dev.response.PaymentResponse;


@Service
@Log4j2
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	
	private  RestTemplate restTemplate;
	
	@Override
	public long placeOrder(OrderRequest orderRequest) {
		log.info("OrderServiceImpl | placeOrder is called");
		log.info("OrderServiceImpl | placeOrder | Placing Order Request orderRequest : " + orderRequest.toString());
		log.info("OrderServiceImpl | placeOrder | Creating Order with Status CREATED");
		
		Order order= Order.builder()
					.amount(orderRequest.getTotalAmount())
					.productId(orderRequest.getProductId())
					.quantity(orderRequest.getQuantity())
					.orderDate(Instant.now())
					.orderStatus("CREATED")
					.build();
		order=orderRepository.save(order);
		log.info("OrderServiceImpl | placeOrder | Calling Payment Service to complete the payment");
		
		PaymentRequest paymentRequest = PaymentRequest.builder()
                .orderId(order.getId())
                .paymentMode(orderRequest.getPaymentMode())
                .amount(orderRequest.getTotalAmount())
                .build();
		String orderStatus = null;
		 try {
	            log.info("OrderServiceImpl | placeOrder | Payment done Successfully. Changing the Oder status to PLACED");
	            orderStatus = "PLACED";
	        } catch (Exception e) {
	            log.error("OrderServiceImpl | placeOrder | Error occurred in payment. Changing order status to PAYMENT_FAILED");
	            orderStatus = "PAYMENT_FAILED";
	        }
		 order.setOrderStatus(orderStatus);
		 orderRepository.save(order);
		 log.info("OrderServiceImpl | placeOrder | Order Places successfully with Order Id: {}", order.getId());

	        return order.getId();
	}

	@Override
	public OrderResponse getOrderDetails(long orderId) {
		 log.info("OrderServiceImpl | getOrderDetails | Get order details for Order Id : {}", orderId);
		 Order order
         = orderRepository.findById(orderId)
         .orElseThrow(() -> new OrderServiceCustomException("Order not found for the order Id:" + orderId,
                 "NOT_FOUND",
                 404));


		  log.info("OrderServiceImpl | getOrderDetails | Invoking Product service to fetch the product for id: {}", order.getProductId());
//	        ProductResponse productResponse
//	                = restTemplate.getForObject(
//	                "http://PRODUCT-SERVICE/product/" + order.getProductId(),
//	                ProductResponse.class
//	        );
	        
		   log.info("OrderServiceImpl | getOrderDetails | Getting payment information form the payment Service");
	        PaymentResponse paymentResponse
	                = restTemplate.getForObject(
	                "http://paymentservice/payment/order/" + order.getId(),
	                PaymentResponse.class
	        );

//	        OrderResponse.ProductDetails productDetails
//	                = OrderResponse.ProductDetails
//	                .builder()
//	                .productName(productResponse.getProductName())
//	                .productId(productResponse.getProductId())
//	                .build();

	        OrderResponse.PaymentDetails paymentDetails
	                = OrderResponse.PaymentDetails
	                .builder()
	                .paymentId(paymentResponse.getPaymentId())
	                .paymentStatus(paymentResponse.getStatus())
	                .paymentDate(paymentResponse.getPaymentDate())
	                .paymentMode(paymentResponse.getPaymentMode())
	                .build();

	        OrderResponse orderResponse
	                = OrderResponse.builder()
	                .orderId(order.getId())
	                .orderStatus(order.getOrderStatus())
	                .amount(order.getAmount())
	                .orderDate(order.getOrderDate())
	                //.productDetails(productDetails)
	                .paymentDetails(paymentDetails)
	                .build();

	        log.info("OrderServiceImpl | getOrderDetails | orderResponse : " + orderResponse.toString());

	        return orderResponse;
	}

}
