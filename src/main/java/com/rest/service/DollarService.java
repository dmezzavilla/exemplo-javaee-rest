package com.rest.service;

import com.rest.entity.Dollar;
import com.rest.repository.DollarRepository;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Daniel Mezzavilla
 */
@Path("/dollar")
public class DollarService {

    @Inject
    DollarRepository dollarRepository;

    @POST
    public void persist() {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("https://economia.awesomeapi.com.br/json/USD-BRL/");
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();

        List<Dollar> cotacaoDollar = response.readEntity(new GenericType<List<Dollar>>() {
        });

        for (Dollar d : cotacaoDollar) {
            dollarRepository.persist(d);
        }

    }
}
