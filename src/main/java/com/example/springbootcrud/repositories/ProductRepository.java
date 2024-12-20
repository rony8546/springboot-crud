package com.example.springbootcrud.repositories;

import com.example.springbootcrud.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
