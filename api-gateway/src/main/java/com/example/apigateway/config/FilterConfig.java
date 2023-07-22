package com.example.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// yml 라우팅 설정 대신 java 파일로 라우팅 설정 하는 방법
@Configuration
public class FilterConfig {

     @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/a-service/**")
                        .filters(f -> f.addRequestHeader("a-request", "request_value")
                                       .addResponseHeader("a-response", "response_value"))
                        .uri("http://localhost:8081"))
                .route(r -> r.path("/b-service/**")
                        .filters(f -> f.addRequestHeader("b-request", "b-request_value")
                                .addResponseHeader("b-response", "b-response_value"))
                        .uri("http://localhost:8082"))
                .build();
    }

}
