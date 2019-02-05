package com.rest.service;

import com.rest.entity.Cep;
import com.rest.repository.CepRepository;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Daniel Mezzavilla
 */
@Path("/cep")
public class CepService {

    @Inject
    CepRepository cepRepository;

    @POST
    public void persist() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://viacep.com.br/ws/01001000/json/");
        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();
        Cep cep = response.readEntity(Cep.class);
        cepRepository.persist(cep);
    }

}
