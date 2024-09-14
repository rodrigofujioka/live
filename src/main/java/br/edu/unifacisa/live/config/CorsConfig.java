package br.edu.unifacisa.live.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permitir todas as rotas
                        .allowedMethods("*") // Permitir todos os métodos HTTP (GET, POST, PUT, DELETE, etc)
                        .allowedOrigins("*") // Permitir todas as origens
                        .allowedHeaders("*"); // Permitir todos os cabeçalhos
            }
        };
    }
}