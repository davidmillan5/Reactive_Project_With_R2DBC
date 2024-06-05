package com.bancolombia.polizas.domain.repositories;

import com.bancolombia.polizas.domain.entities.Cliente;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ClienteRepository extends ReactiveCrudRepository<Cliente, Long> {
}
