package com.rest.repository.impl;

import com.rest.entity.Cep;
import com.rest.repository.CepRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @author Daniel Mezzavilla
 */
public class CepRepositoryImpl implements CepRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    @Override
    public void persist(Cep cep) {
        em.persist(cep);
    }
}
