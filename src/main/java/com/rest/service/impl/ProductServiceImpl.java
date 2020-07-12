package com.rest.service.impl;

import com.rest.entity.Category;
import com.rest.entity.Product;
import com.rest.repository.ProdutcRepository;
import com.rest.service.ProductService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Inject
    ProdutcRepository produtcRepository;

    @Transactional
    @Override
    public Product persist(Product product) {
        return produtcRepository.persist(product);
    }

    @Override
    public List<Product> findAll() {
        return produtcRepository.findAll();
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return produtcRepository.findByCategory(category);
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
