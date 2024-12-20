package com.example.springbootcrud.servicies;

import com.example.springbootcrud.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> finAll();

    Optional<Product> findById(Long id);

    Product save (Product product);

    Optional<Product> update (Long id, Product product);

    Optional<Product> delect (Long id);


}
