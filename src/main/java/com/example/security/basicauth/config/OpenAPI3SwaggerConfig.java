package com.example.security.basicauth.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI 3 Swagger Specification Configuration.
 */
@Configuration
public class OpenAPI3SwaggerConfig {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${spring.profile.active}")
    private String appProfile;

    @Value("#{'${application.servers}'.split(',')}")
    private List<String> servers;

    @Bean
    public OpenAPI customAPI() {

        Contact contact = new Contact();
        contact.setName("OpenAPI3 Example Application");
        contact.url("www.google.com");
        contact.email("test@email.com");

        Info info = new Info()
                .title((StringUtils.join(appName)))
                .description("Spring boot sample application to demonstrate JSONB data type support using PostgreSQL database along with OpenAPI 3 specifications")
                .version("1.0")
                .contact(contact)
                .license(new License().name("My Application 1.0").url("www.google.com"));

        SecurityRequirement securityRequirement = new SecurityRequirement();
        Components components = new Components();
        components.addSecuritySchemes("basicAuth", new SecurityScheme().name("basicAuth")
                .type(SecurityScheme.Type.HTTP).scheme("basic"));
        securityRequirement.addList("basicAuth");

        return new OpenAPI().info(info)
                .components(components)
                .addSecurityItem(securityRequirement)
                .servers(List.of());
    }

}
