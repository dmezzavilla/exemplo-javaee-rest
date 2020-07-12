package com.rest.controller;

import com.rest.entity.Product;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Daniel Mezzavilla
 */
@Path("/auth")
public class UserController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response login(Product product) {
        return Response.ok("produtoService.persist(produto)", MediaType.APPLICATION_JSON).build();
    }

}
