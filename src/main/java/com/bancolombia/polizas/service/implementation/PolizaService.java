package com.bancolombia.polizas.service.implementation;

import com.bancolombia.polizas.domain.entities.Cliente;
import com.bancolombia.polizas.domain.entities.Poliza;
import com.bancolombia.polizas.domain.repositories.PolizaRepository;
import com.bancolombia.polizas.service.IPolizaService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PolizaService implements IPolizaService {
    private final PolizaRepository repository;

    public PolizaService(PolizaRepository repository){
        this.repository = repository;
    }


    @Override
    public Mono<Poliza> crearPoliza(Poliza poliza) {
        return repository.save(poliza);
    }

    @Override
    public Flux<Poliza> obtenerPolizasPorCliente(Long clienteId) {
        return repository.findByClienteId(clienteId);
    }
}
