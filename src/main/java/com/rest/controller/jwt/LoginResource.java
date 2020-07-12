package com.rest.controller.jwt;

import com.rest.entity.Customer;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Path("login")
public class LoginResource {

    private final SecretKey KEY = Keys.hmacShaKeyFor("7f-j&CKk=coNzZc0y7_4obMP?#TfcYq%fcD0mDpenW2nc!lfGoZ|d?f&RNbDHUX6"
            .getBytes(StandardCharsets.UTF_8));

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(Customer customer) {
        try {
            if (customer.getUsername().equals("teste@treinaweb.com.br") && customer.getPassword().equals("1234")) {
                String jwtToken = Jwts.builder()
                        .setSubject(customer.getUsername())
                        .setIssuer("localhost:8080")
                        .setIssuedAt(new Date())
                        .setExpiration(Date.from(LocalDateTime.now().plusMinutes(15L)
                                .atZone(ZoneId.systemDefault())
                                .toInstant()))
                        //.signWith(KEY, SignatureAlgorithm.RS512)
                        .compact();
                return Response.status(Response.Status.OK).entity(jwtToken).build();
            } else
                return Response.status(Response.Status.UNAUTHORIZED).entity("Usuário e/ou senha inválidos").build();
        } catch (Exception ex) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        }
    }
}

