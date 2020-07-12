package com.rest.controller;

import com.rest.entity.Category;
import com.rest.entity.Product;
import com.rest.service.CategoryService;
import com.rest.service.ProductService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
@Path("/product")
public class ProductController {

    @Inject
    ProductService productService;
    @Inject
    CategoryService categoryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response persist(Product product) {
        return Response.ok(productService.persist(product), MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/findBy/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Product findById(@PathParam("id") Long id) {
        return productService.findById(id);
    }

    @GET
    @Path("/findLike/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Product> findLike(@PathParam("id") Long id) {
        return productService.findLike();
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response merge(Product product) {
        return Response.ok(productService.merge(product), MediaType.APPLICATION_JSON).build();
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public void remove(@PathParam("id") Long id) {
        productService.remove(id);
    }

}
