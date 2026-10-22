package br.com.cotiinformatica.api_clientes.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("API de Gerenciamento de Clientes e Planos")
                        .version("v1")
                        .description("""
                            API REST desenvolvida com Java e Spring Boot
                            para gerenciamento de clientes e planos.
        
                            Funcionalidades:
                            - Cadastro, consulta, atualização e exclusão de clientes.
                            - Consulta de planos.
                            - Associação de clientes aos planos disponíveis.
                            - Validação de dados e regras de negócio.
                            - Integração com banco de dados.
        
                            Projeto desenvolvido para fins educacionais
                            durante o curso Java WebDeveloper Fullstack
                            da COTI Informática.
        
                            Esta documentação apresenta os endpoints,
                            parâmetros, modelos de dados e respostas HTTP
                            disponibilizados pela aplicação.
                    """)
                        .contact(new Contact()
                                .name("COTI Informática")
                                .url("https://www.cotiinformatica.com.br")
                        )
                );
    }
}