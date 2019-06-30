package com.dropwizard.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sample")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {

    private final String version;


    public SampleResource(String version) {
        this.version = version;
    }

    @GET
    public SampleResponse sayHello() {
        SampleResponse response = new SampleResponse("shankar", "https://shankarganesh1234.github.io/#dropwizard-quickstart", version);
        return response;
    }
}
