package com.rest.repository.impl;

import com.rest.entity.Category;
import com.rest.entity.Product;
import com.rest.repository.ProdutcRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
public class ProdutcRepositoryImpl implements ProdutcRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public Product persist(Product product) {
        em.persist(product);
        em.flush();
        return product;
    }

    @Transactional
    @Override
    public List<Product> findAll() {
        String jpql = "FROM Product";
        TypedQuery<Product> query = em.createQuery(jpql, Product.class);
        return query.getResultList();

    }

    @Transactional
    @Override
    public List<Product> findLike() {
        String jpql = "FROM Product p WHERE p.manufacturer LIKE ?1" +
                "OR p.model LIKE ?1" +
                "OR p.type LIKE ?1";
        TypedQuery<Product> query = em.createQuery(jpql, Product.class).setParameter(1, "%To%");
        return query.getResultList();
    }

    @Transactional
    @Override
    public Product findById(Long id) {
        return em.find(Product.class, id);

    }

    @Transactional
    @Override
    public List<Product> findByCategory(Category category) {
        String jpql = "FROM Product p WHERE p.category = ?1";
        TypedQuery<Product> query = em.createQuery(jpql, Product.class).setParameter(1, category);
        return query.getResultList();
    }

    @Transactional
    @Override
    public Product merge(Product product) {
        em.merge(product);
        em.flush();
        return product;
    }

    @Transactional
    @Override
    public void remove(Long id) {
        em.remove(em.getReference(Product.class, id));
    }

}
