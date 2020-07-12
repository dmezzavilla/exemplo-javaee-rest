package com.rest.repository.impl;

import com.rest.entity.Category;
import com.rest.entity.Product;
import com.rest.repository.CategoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    @Override
    public Category persist(Category category) {
        em.persist(category);
        em.flush();
        return category;
    }

    @Transactional
    @Override
    public Category findById(Long id) {
        return em.find(Category.class, id);
    }

    @Transactional
    @Override
    public List<Category> findAll() {
        String jpql = "FROM Category";
        TypedQuery<Category> query = em.createQuery(jpql, Category.class);
        return query.getResultList();
    }
}
