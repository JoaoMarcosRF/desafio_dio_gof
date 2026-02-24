package com.dio.gof.service.implementation;

import com.dio.gof.model.Cliente;
import com.dio.gof.model.ClienteRepository;
import com.dio.gof.model.Endereco;
import com.dio.gof.model.EnderecoRepository;
import com.dio.gof.service.ClienteService;
import com.dio.gof.service.ViaCepService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    ClienteRepository clienteRepository;
    EnderecoRepository enderecoRepository;
    ViaCepService viaCepService;

    public ClienteServiceImpl(
            ClienteRepository clienteRepository,
            EnderecoRepository enderecoRepository,
            ViaCepService viaCepService)
    {
            this.clienteRepository = clienteRepository;
            this.enderecoRepository = enderecoRepository;
            this.viaCepService = viaCepService;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> procurarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void inserirCliente(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizarCliente(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {

            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });


        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}

