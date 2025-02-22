package spring.raju.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j2;
import spring.raju.dev.request.ProductRequest;
import spring.raju.dev.response.ProductResponse;
import spring.raju.dev.service.ProductService;

@Controller
@RequestMapping("/product")
@Log4j2
public class ProductController {

	@Autowired
	private ProductService service;
	@PostMapping
	public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest){
		System.out.println("ProductController | addProduct is called");
		System.out.println("ProductController | addProduct | productRequest : " + productRequest.toString());
		
		long productId= service.addProduct(productRequest);
		
		return new ResponseEntity<>(productId, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") long productId){
		System.out.println("ProductController | getProductById is called");
		System.out.println("ProductController | getProductById | productId : " + productId);
		
		ProductResponse productResponse = service.getProductById(productId);
		
		return new ResponseEntity<>(productResponse, HttpStatus.OK);
		
	}
	@PutMapping("/reduceQuantity/{id}")
	  public  ResponseEntity<Void> reduceQuantity(@PathVariable("id") long productId,@RequestParam long quantity){
		  log.info("ProductController | reduceQuantity is called");

	        log.info("ProductController | reduceQuantity | productId : " + productId);
	        log.info("ProductController | reduceQuantity | quantity : " + quantity);
	        service.reduceQuantity(productId, quantity);
		  return new ResponseEntity<>(HttpStatus.OK);
	  }
	  @DeleteMapping("/{id}")
	    public void deleteProductById(@PathVariable("id") long productId) {
	        service.deleteProductById(productId);
	    }
}
