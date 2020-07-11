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
    public Produto persist(Produto produto) {
        em.persist(produto);
        em.flush();
        return produto;
    }

    @Transactional
    @Override
    public List<Produto> findAll() {
        String jpql = "FROM Produto";
        TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);
        return query.getResultList();

    }

    @Override
    public List<Produto> findLike() {
        String jpql = "FROM Produto p WHERE p.fabricante LIKE ?1" +
                "OR p.modelo LIKE ?1" +
                "OR p.tipo LIKE ?1";
        TypedQuery<Produto> query = em.createQuery(jpql, Produto.class).setParameter(1, "%To%");
        return query.getResultList();
    }

    @Transactional
    @Override
    public Produto findById(Long id) {
        return em.find(Produto.class, id);

    }

    @Transactional
    @Override
    public Produto merge(Produto produto) {
        em.merge(produto);
        em.flush();
        return produto;
    }

    @Transactional
    @Override
    public void remove(Long id) {
        em.remove(em.getReference(Produto.class, id));
    }

}
