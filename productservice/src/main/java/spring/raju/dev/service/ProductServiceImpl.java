package spring.raju.dev.service;

import static org.springframework.beans.BeanUtils.copyProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import spring.raju.dev.exception.ProductServiceCustomException;
import spring.raju.dev.model.Product;
import spring.raju.dev.repo.ProductRepository;
import spring.raju.dev.request.ProductRequest;
import spring.raju.dev.response.ProductResponse;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public long addProduct(ProductRequest productRequest) {
	System.out.println("ProductServiceImpl || addProduct is called ");
	
	Product product=Product.builder()
			.productName(productRequest.getName())
			.quantity(productRequest.getQuantity())
			.price(productRequest.getPrice())
			.build();
	product=productRepository.save(product);
	System.out.println("ProductServiceImpl | addProduct | Product Created");
	System.out.println("ProductServiceImpl | addProduct | Product Id :  "+  product.getProductId());
	
	return product.getProductId();
	}

	@Override
	public ProductResponse getProductById(Long productId) {
		System.out.println("ProductServiceImpl | getProductById is called");
		//System.out.println
		log.info("ProductController | getProductById | productId :  {}",  productId);
		Product product =productRepository.findById(productId)
				.orElseThrow(
                        () -> new ProductServiceCustomException(
                        		"Product with given Id not found","PRODUCT_NOT_FOUND"));
		
		ProductResponse productResponse = new ProductResponse();
		copyProperties(product, productResponse);
		System.out.println("ProductServiceImpl | getProductById | productResponse :" + productResponse.toString());
		return productResponse;
	}

	@Override
	public void reduceQuantity(long productId, long quantity) {
		log.info("Reduce Quantity {} for Id: {}", quantity,productId);
		Product product= productRepository.findById(productId)
						.orElseThrow(() -> new ProductServiceCustomException(
								"Product with given Id not found",
		                        "PRODUCT_NOT_FOUND"
								));
				if(product.getQuantity() < quantity) {
					throw new ProductServiceCustomException( "Product does not have sufficient Quantity",
		                    "INSUFFICIENT_QUANTITY");
				}
				product.setQuantity(product.getQuantity() -  quantity);
				productRepository.save(product);
				log.info("Product Quantity updated Successfully");
		
	}

	@Override
	public void deleteProductById(long ProductId) {
		log.info("Product id: {}", ProductId);
		if(!productRepository.existsById(ProductId)) {
			 log.info("Im in this loop {}", !productRepository.existsById(ProductId));
	            throw new ProductServiceCustomException(
	                    "Product with given with Id: " + ProductId + " not found:",
	                    "PRODUCT_NOT_FOUND");
		}
		  log.info("Deleting Product with id: {}", ProductId);
	        productRepository.deleteById(ProductId);
		
	}
	
	

}
