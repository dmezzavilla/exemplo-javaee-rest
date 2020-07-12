package com.rest.service.impl;

import com.rest.entity.Product;
import com.rest.repository.ProdutcRepository;
import com.rest.service.ProductService;

import javax.inject.Inject;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Inject
    ProdutcRepository produtcRepository;

    @Override
    public Product persist(Product product) {
        return produtcRepository.persist(product);
    }

    @Override
    public List<Product> findAll() {
        return produtcRepository.findAll();
    }

    @Override
    public List<Product> findLike() {
        return produtcRepository.findLike();
    }

    @Override
    public Product findById(Long id) {
        return produtcRepository.findById(id);
    }

    @Override
    public Product merge(Product product) {
        return produtcRepository.merge(product);
    }

    @Override
    public void remove(Long id) {
        produtcRepository.remove(id);
    }
}
