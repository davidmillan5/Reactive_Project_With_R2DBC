package com.bancolombia.polizas.domain.repositories;

import com.bancolombia.polizas.domain.entities.Poliza;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PolizaRepository extends ReactiveCrudRepository<Poliza, Long> {
    Flux<Poliza> findByClienteId(Long clienteId);
}
