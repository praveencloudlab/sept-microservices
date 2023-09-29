package com.cts.ecart.controller;

import java.util.List;

import com.cts.ecart.model.Product;

public interface ProductService {

	List<Product> loadProducts();

	Product findById(int id);

	double findPrice(int id);

}