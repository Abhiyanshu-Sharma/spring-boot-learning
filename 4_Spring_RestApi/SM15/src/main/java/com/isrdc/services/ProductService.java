package com.isrdc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.ProductDTO;
import com.isrdc.entities.Product;
import com.isrdc.repos.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public ArrayList<ProductDTO> collectAllProducts() {
ArrayList<ProductDTO> productDtos = new ArrayList<>();
		
		List<Product> products = productRepo.findAll();
		
		for(Product product : products) {
			ProductDTO productDto = new ProductDTO();
			
			BeanUtils.copyProperties(product, productDto);
			
			productDtos.add(productDto);
		}
		
		return productDtos;
	}
	
	
	public void saveProduct(ProductDTO productDto) {
		Product product = new Product();
		
		BeanUtils.copyProperties(productDto, product);
		
		productRepo.save(product);
	}
}
