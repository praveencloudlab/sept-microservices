package com.cts.ecart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.ecart.model.Product;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin
public class CartRestController {
	
	private RestTemplate rt=new RestTemplate();
	
	
	@GetMapping
	public List<Product> listAllProducts(){
		return rt.getForObject("http://localhost:8081/api/products", List.class);
	}
	
	
	@GetMapping("/price/{id}")
	public double getItemPrice(@PathVariable int id) {
		return rt.getForObject("http://localhost:8081/api/products/price/"+id,Double.class);
	}
	
	
	
	

}
