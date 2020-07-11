package com.rest.service;


import com.rest.entity.Produto;

import java.util.List;

public interface ProdutoService {

    Produto persist(Produto produto);

    List<Produto> findAll();

    List<Produto> findLike();

    Produto findById(Long id);

    Produto merge(Produto produto);

    void remove(Long id);

}
