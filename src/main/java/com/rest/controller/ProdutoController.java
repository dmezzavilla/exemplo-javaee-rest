package com.rest.controller;

import com.rest.entity.Produto;
import com.rest.repository.ProdutoRepository;
import com.rest.service.ProdutoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
@Path("/produto")
public class ProdutoController {

    @Inject
    ProdutoService produtoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Produto> findAll() {
        return produtoService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response persist(Produto produto) {
        return Response.ok(produtoService.persist(produto), MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/findBy/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Produto findById(@PathParam("id") Long id) {
        return produtoService.findById(id);
    }

    @GET
    @Path("/findLike/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Produto> findLike(@PathParam("id") Long id) {
        return produtoService.findLike();
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response merge(Produto produto) {
        return Response.ok(produtoService.merge(produto), MediaType.APPLICATION_JSON).build();
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public void remove(@PathParam("id") Long id) {
        produtoService.remove(id);
    }

}
