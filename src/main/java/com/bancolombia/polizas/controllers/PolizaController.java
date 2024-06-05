package com.bancolombia.polizas.controllers;

import com.bancolombia.polizas.domain.entities.Poliza;
import com.bancolombia.polizas.service.IPolizaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/poliza")
public class PolizaController {
    @Autowired
    private IPolizaService polizaService;
    @PostMapping
    public Mono<Poliza> crearPoliza(@RequestBody Poliza poliza){
        return polizaService.crearPoliza(poliza);
    }
    @GetMapping("/cliente/{clienteId}")
    public Flux<Poliza> obtenerTodos(@PathVariable Long clienteId){
        return polizaService.obtenerPolizasPorCliente(clienteId);
    }
}
