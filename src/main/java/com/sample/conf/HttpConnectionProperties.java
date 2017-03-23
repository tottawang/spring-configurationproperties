package com.sample.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "http")
public class HttpConnectionProperties {

  private Integer connectionRequestTimeout = Integer.valueOf(5000);
  private Integer maxPerRoute = Integer.valueOf(64);
  private Integer maxTotalConnections = Integer.valueOf(128);

  public Integer getConnectionRequestTimeout() {
    return connectionRequestTimeout;
  }

  public void setConnectionRequestTimeout(Integer connectionRequestTimeout) {
    this.connectionRequestTimeout = connectionRequestTimeout;
  }

  public Integer getMaxPerRoute() {
    return maxPerRoute;
  }

  public void setMaxPerRoute(Integer maxPerRoute) {
    this.maxPerRoute = maxPerRoute;
  }

  public Integer getMaxTotalConnections() {
    return maxTotalConnections;
  }

  public void setMaxTotalConnections(Integer maxTotalConnections) {
    this.maxTotalConnections = maxTotalConnections;
  }

  @Override
  public String toString() {
    return String.format("%s [connectionRequestTimeout=%s maxPerRoute=%s maxTotalConnections=%s]",
        this.getClass().getSimpleName(), connectionRequestTimeout, maxPerRoute,
        maxTotalConnections);
  }
}
