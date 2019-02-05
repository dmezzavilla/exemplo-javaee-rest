package com.rest.repository.impl;

import com.rest.entity.Dollar;
import com.rest.repository.DollarRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @author Daniel Mezzavilla
 */
public class DollarRepositoryImpl implements DollarRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void persist(Dollar dollar) {
        em.persist(dollar);
    }
}
