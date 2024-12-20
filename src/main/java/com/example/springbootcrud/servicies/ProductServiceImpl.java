package com.example.springbootcrud.servicies;

import com.example.springbootcrud.entities.Product;
import com.example.springbootcrud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> finAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Optional<Product> update(Long id, Product product) {
        Optional<Product> productOptional = repository.findById(id);
        if(productOptional.isPresent()){
            Product productDb = productOptional.orElseThrow();

            productDb.setName(product.getName());
            productDb.setPrice(product.getPrice());
            productDb.setDescription(product.getDescription());
            return Optional.of(repository.save(productDb));
        }
        return productOptional;
    }

    @Override
    @Transactional
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    @Transactional
    public Optional<Product> delect(Long id) {
        Optional<Product> productOptional = repository.findById(id);
        productOptional.ifPresent(productDb -> {repository.delete(productDb);
        });
        return productOptional;
    }
}
