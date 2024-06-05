package com.bancolombia.polizas.service.implementation;

import com.bancolombia.polizas.domain.entities.Cliente;
import com.bancolombia.polizas.domain.repositories.ClienteRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public Mono<Cliente> crear(Cliente cliente){
        return  repository.save(cliente);
    }
    public Flux<Cliente> obtenerTodos(){
        return repository.findAll();
    }

}
