package com.rest.service;

import com.rest.entity.Category;

import java.util.List;

public interface CategoryService {
    Category persist(Category category);

    Category findById(Long id);

    List<Category> findAll();
}
