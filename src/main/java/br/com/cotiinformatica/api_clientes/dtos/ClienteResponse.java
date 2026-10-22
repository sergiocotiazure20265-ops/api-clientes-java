package br.com.cotiinformatica.api_clientes.dtos;

import java.time.LocalDateTime;

public record ClienteResponse(
        Integer id,
        String nome,
        String email,
        String cpf,
        Integer planoId,
        LocalDateTime dataHoraCadastro
) {
}
