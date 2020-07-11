package com.rest.service.impl;

import com.rest.entity.Produto;
import com.rest.repository.ProdutoRepository;
import com.rest.service.ProdutoService;

import javax.inject.Inject;
import java.util.List;

public class ProdutoServiceImpl implements ProdutoService {

    @Inject
    ProdutoRepository produtoRepository;

    @Override
    public Produto persist(Produto produto) {
        return produtoRepository.persist(produto);
    }

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public List<Produto> findLike() {
        return produtoRepository.findLike();
    }

    @Override
    public Produto findById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto merge(Produto produto) {
        return produtoRepository.merge(produto);
    }

    @Override
    public void remove(Long id) {
        produtoRepository.remove(id);
    }
}
