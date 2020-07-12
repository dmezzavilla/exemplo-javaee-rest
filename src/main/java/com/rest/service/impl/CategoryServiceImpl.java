package com.rest.service.impl;

import com.rest.entity.Category;
import com.rest.repository.CategoryRepository;
import com.rest.service.CategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Inject
    CategoryRepository categoryRepository;

    @Override
    public Category persist(Category category) {
        return categoryRepository.persist(category);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
