package com.software.produtos.controller;

import com.software.produtos.model.Product;
import com.software.produtos.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public List<Product> findAll() {
        log.info("/findAll");
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") Long id) {
        log.info("GET findById, id: {}", id);
        return this.service.findById(id);
    }

    @PostMapping("/")
    public Product save(Product product) {
        log.info("POST post, product: {}", product);
        return this.service.save(product);
    }

    @PutMapping("/")
    public Product update(Product product) {
        log.info("PUT post, product: {}", product);
        return this.service.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        log.info("DELETE delete, id: {}", id);
        this.service.delete(id);
    }

}
