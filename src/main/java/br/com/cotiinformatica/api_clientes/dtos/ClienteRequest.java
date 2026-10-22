package br.com.cotiinformatica.api_clientes.dtos;

public record ClienteRequest(
        String nome,
        String email,
        String cpf,
        Integer planoId
) {
}
