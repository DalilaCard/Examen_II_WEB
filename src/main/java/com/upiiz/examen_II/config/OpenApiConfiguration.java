package com.upiiz.examen_II.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API departments",
                description = "Esta API proporciona acceso a los recursos de Departments",
                version = "1.0.0",
                contact = @Contact(
                        name = "Martha Dalila Cardona Serna",
                        email = "mcardonas2000@alumno.ipn.mx",
                        url = "http://localhost:8080/contacto"
                ),
                license = @License(),
                termsOfService = "Solo se permiten 400 solicitudes"
        ),
        servers = {
                @Server(
                        description = "Servidor de pruebas",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "Servidor de Produccion",
                        url = "https://examen-ii-web-1.onrender.com"
                )
        },
        tags = {
                @Tag(
                        name = "departments",
                        description = "EndPoint de los recursos"
                )
        }
)
public class OpenApiConfiguration {
}
