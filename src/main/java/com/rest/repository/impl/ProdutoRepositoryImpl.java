package com.rest.repository.impl;

import com.rest.entity.Produto;
import com.rest.repository.ProdutoRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
public class ProdutoRepositoryImpl implements ProdutoRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void persist(Produto produto) {
        em.persist(produto);

    }

    @Transactional
    @Override
    public List<Produto> findAll() {
        TypedQuery<Produto> query = em.createQuery("from Produto", Produto.class);
        return query.getResultList();

    }

    @Transactional
    @Override
    public Produto findById(Long id) {
        return em.find(Produto.class, id);

    }

    @Transactional
    @Override
    public void merge(Produto produto) {
        em.merge(produto);
    }

    @Transactional
    @Override
    public void remove(Long id) {
        em.remove(em.getReference(Produto.class, id));
    }

}
