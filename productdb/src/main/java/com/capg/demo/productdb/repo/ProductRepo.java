package com.capg.demo.productdb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.productdb.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
