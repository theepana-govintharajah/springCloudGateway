package com.example.GatewayApplication;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutes {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/event/**")
                        .uri("http://localhost:8081"))

                .route(r -> r.path("/api/organization/**")
                        .uri("http://localhost:8082"))


                .build();
    }
}
