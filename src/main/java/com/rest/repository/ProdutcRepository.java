package com.rest.repository;

import com.rest.entity.Product;

import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
public interface ProdutcRepository {

    Product persist(Product product);

    List<Product> findAll();

    List<Product> findLike();

    Product findById(Long id);

    Product merge(Product product);

    void remove(Long id);

}
