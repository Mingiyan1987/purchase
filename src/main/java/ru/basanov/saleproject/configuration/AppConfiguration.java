package ru.basanov.saleproject.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableAutoConfiguration
@EnableIntegration
@Configuration
@ComponentScan("ru.basanov.saleproject")
public class AppConfiguration implements WebMvcConfigurer {
}
