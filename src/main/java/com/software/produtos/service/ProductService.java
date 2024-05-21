package com.software.produtos.service;

import com.software.produtos.model.Product;
import com.software.produtos.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return this.repository.findAll();
    }

    public Product findById(Long id) {
        return this.repository.findById(id).orElseThrow(() -> new RuntimeException("No Products found"));
    }

    public Product save(Product product) {
        return this.repository.save(product);
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }
}
