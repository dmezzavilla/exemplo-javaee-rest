package com.rest.service;

import com.rest.entity.Produto;
import com.rest.repository.ProdutoRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
@Path("/produto")
public class ProdutoService {

    @Inject
    ProdutoRepository produtoRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.TEXT_PLAIN)
    public void persist(Produto produto) {
        produtoRepository.persist(produto);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Produto findById(@PathParam("id") Long id) {
        return produtoRepository.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.TEXT_PLAIN)
    public void merge(Produto produto) {
        produtoRepository.merge(produto);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public void remove(@QueryParam("id") Long id) {
        produtoRepository.remove(id);
    }

}
