package com.rest.repository;

import com.rest.entity.Produto;

import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
public interface ProdutoRepository {

    Produto persist(Produto produto);

    List<Produto> findAll();

    List<Produto> findLike();

    Produto findById(Long id);

    Produto merge(Produto produto);

    void remove(Long id);

}
