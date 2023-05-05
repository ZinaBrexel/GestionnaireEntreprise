package fr.simplon.gestionnaireentreprise.api;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
@OpenAPIDefinition(info = @Info(title = "Open API specifications",
        description = "Points d'entrée de l'API de gestion d'entreprise"),
        servers = @Server(url = "http://localhost:8080/oxo_assurance"))
public class OpenApiConfiguration {
}
