package br.com.cotiinformatica.api_clientes.controllers;

import br.com.cotiinformatica.api_clientes.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/planos")
public class PlanoController {

    @Autowired
    private PlanoRepository planoRepository;

    @GetMapping
    public ResponseEntity<?> getAll() {

        try {
            //Consultar a lista de planos no banco de dados
            var planos = planoRepository.obterTodos();

            //HTTP 200 (OK)
            return ResponseEntity.status(200).body(planos);
        }
        catch(Exception e) {
            //HTTP 500 (INTERNAL SERVER ERROR)
            return ResponseEntity.status(500).body("Falha: " + e.getMessage());
        }
    }
}
