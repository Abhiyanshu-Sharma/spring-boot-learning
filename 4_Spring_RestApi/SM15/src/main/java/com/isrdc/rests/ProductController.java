package com.isrdc.rests;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.ProductDTO;
import com.isrdc.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/show_products", produces = {"application/json", "application/xml"})
	public ResponseEntity<ArrayList<ProductDTO>> showAllProducts() {
		
		ArrayList<ProductDTO> productDtos = productService.collectAllProducts();
		
		return ResponseEntity.ok(productDtos);
	}
	
	@PostMapping("/save_product")
	public ResponseEntity<String> saveNewProduct(@RequestBody ProductDTO productDto) {
		
		productService.saveProduct(productDto);
		
		return new ResponseEntity<>("The Product is Saved...", HttpStatus.ACCEPTED);
	}
}
