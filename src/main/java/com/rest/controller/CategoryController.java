package com.rest.controller;

import com.rest.entity.Category;
import com.rest.service.CategoryService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
@Path("/category")
public class CategoryController {

    @Inject
    CategoryService categoryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response persist(Category category) {
        return Response.ok(categoryService.persist(category), MediaType.APPLICATION_JSON).build();
    }
}
