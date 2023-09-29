package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.model.Product;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductRestResouce {
	
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping
	public List<Product> loadProducts(){
		return prodService.loadProducts();
	}
	
	@GetMapping("/{id}")
	public Product findProduct(@PathVariable int id) {
		return prodService.findById(id);
	}
	
	@GetMapping("/price/{id}")
	public double getPrice(@PathVariable int id) {
		return prodService.findPrice(id);
	}
	
	
	
	
	
	
	
	
	
}
