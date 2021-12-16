package com.ratnaglobal.curd.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnaglobal.curd.example.enitity.Product;

public interface ProductRepository extends  JpaRepository<Product,Integer>
{

	Product findByName(String name);

	

}
