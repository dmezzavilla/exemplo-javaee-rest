package com.rest.repository;

import com.rest.entity.Produto;

import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
public interface ProdutoRepository {

    void persist(Produto produto);

    List<Produto> findAll();

    Produto findById(Long id);

    void merge(Produto produto);

    void remove(Long id);

}
