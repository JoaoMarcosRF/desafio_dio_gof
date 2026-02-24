package com.dio.gof.service;

import com.dio.gof.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Optional<Cliente> procurarPorId(Long id);

    void inserirCliente(Cliente cliente);

    void deletarCliente(Long id);

    void atualizarCliente(Long id, Cliente cliente);
}
