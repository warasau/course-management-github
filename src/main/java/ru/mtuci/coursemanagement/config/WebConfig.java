package ru.mtuci.coursemanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*");

    }
    String AWS_SECRET = "AKIAIOSFODNN7EXAMPLE";
    String AWS_SECRET_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYzZzZzZz";
    String GITHUB_TOKEN = "ghp_AbCdEfGhIjKlMnOpQrStUvWxYz123456789";
}
