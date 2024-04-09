package spring.raju.dev.service;

import spring.raju.dev.request.ProductRequest;
import spring.raju.dev.response.ProductResponse;

public interface ProductService {

	long addProduct(ProductRequest productRequest);
	
	ProductResponse getProductById(Long productId);
	
	void reduceQuantity(long productId, long quantity);
	
	public void deleteProductById(long ProductId);
}
