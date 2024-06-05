package com.bancolombia.polizas.controllers;

import com.bancolombia.polizas.domain.entities.Cliente;
import com.bancolombia.polizas.service.implementation.ClienteService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Mono<Cliente> crearCliente(@RequestBody Cliente cliente) {
        return clienteService.crear(cliente);
    }

    @GetMapping
    public Flux<Cliente> obtenerTodosLosClientes() {
        return clienteService.obtenerTodos();
    }
}
