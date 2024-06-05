package com.bancolombia.polizas.service;

import com.bancolombia.polizas.domain.entities.Poliza;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPolizaService {
    Mono<Poliza> crearPoliza(Poliza poliza);
    Flux<Poliza> obtenerPolizasPorCliente(Long clienteId);
}
