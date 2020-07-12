package com.rest.service;

import com.rest.entity.Category;

import java.util.List;

public interface CategoryService {
    Category persist(Category category);

    List<Category> findAll();
}
