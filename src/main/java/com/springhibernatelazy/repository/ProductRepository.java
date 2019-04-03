package com.springhibernatelazy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springhibernatelazy.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
