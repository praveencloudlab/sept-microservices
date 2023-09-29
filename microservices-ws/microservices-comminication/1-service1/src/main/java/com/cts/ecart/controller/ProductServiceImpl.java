package com.cts.ecart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.ecart.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> prods = new ArrayList<Product>();

	public ProductServiceImpl() {

		prods.add(new Product(10, "Laptop", "Dell", 56000));
		prods.add(new Product(11, "Mobile", "Samsung", 34000));
		prods.add(new Product(12, "Keyword", "Wiresless", 1400));
		prods.add(new Product(13, "Bag", "laptop Bakpack", 12000));
		prods.add(new Product(14, "Ipad", "Apple Ipad Pro", 150000));

	}

	@Override
	public List<Product> loadProducts() {
		return prods;
	}
	
	@Override
	public Product findById(int id) {
		return prods.stream().filter(prod->prod.getId()==id).findFirst().orElse(null);
	}
	
	@Override
	public double findPrice(int id) {
		
		Product prodObj=prods.stream().filter(prod->prod.getId()==id).findFirst().orElse(null);
		if(prodObj!=null)
			return prodObj.getPrice();
		else
			return 0.0;
		//return prods.stream().filter(prod->prod.getId()==id).map(Double::price));
	}
	
	
	
	
	

}
