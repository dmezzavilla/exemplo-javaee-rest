package com.rest.repository;

import com.rest.entity.Category;

import java.util.List;

public interface CategoryRepository {

    Category persist(Category category);

    Category findById(Long id);

    List<Category> findAll();
}
