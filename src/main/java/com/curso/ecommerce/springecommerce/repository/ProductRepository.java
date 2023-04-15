package com.curso.ecommerce.springecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.springecommerce.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    
}
