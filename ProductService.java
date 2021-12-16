package com.ratnaglobal.curd.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratnaglobal.curd.example.enitity.Product;
import com.ratnaglobal.curd.example.repository.ProductRepository;


@Service
public class ProductService 
{
	
	@Autowired
	private ProductRepository repository;


	public Product saveProduct(Product product) {
	return repository.save(product);
	

	}



	public List<Product> saveProducts( List<Product> products) {
	return repository.saveAll(products);

	}
	public Optional<Product> getProductById(int id) {
	return repository.findById(id);

	}




	public String deleteById(int id) {
	repository.deleteById(id);
	return "Product is deleted:"+id;

	}



	public Product update(Product product) {
	Product existingproduct= repository.findById(product.getId()).orElse(null);

	existingproduct.setName(product.getName());
	existingproduct.setPrice(product.getPrice());
	existingproduct.setQuantity(product.getQuantity());

	return repository.save(existingproduct);

}
	}