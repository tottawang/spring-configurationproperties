package com.sample.conf;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

@Configuration
@EnableConfigurationProperties(HttpConnectionProperties.class)
public class ApplicationConfig extends ResourceConfig {

  public ApplicationConfig() {
    packages("com.sample.resources");
    JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
    provider.setMapper(objectMapper);
    register(provider);
  }
}
