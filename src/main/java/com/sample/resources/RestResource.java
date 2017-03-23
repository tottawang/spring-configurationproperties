package com.sample.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.conf.HttpConnectionProperties;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class RestResource {

  @Autowired
  private HttpConnectionProperties httpConnectionProperties;

  @GET
  @Path("get-config-prop")
  public String getConfigProp() throws InterruptedException {
    return httpConnectionProperties.toString();
  }
}
