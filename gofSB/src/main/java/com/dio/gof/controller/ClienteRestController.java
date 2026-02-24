package com.dio.gof.controller;

import com.dio.gof.model.Cliente;
import com.dio.gof.service.implementation.ClienteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
    private ClienteServiceImpl clienteService;

    public ClienteRestController(ClienteServiceImpl clienteService){
        this.clienteService = clienteService;
    }


    //quebrei a cabeça para entender isso aq, jesus Cristo
    @GetMapping()
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.procurarPorId(id));
    }

    @PostMapping()
    public ResponseEntity<Cliente> InserirCliente(@RequestBody Cliente cliente){
        clienteService.inserirCliente(cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> DeletarCliente(@PathVariable Long id){
        clienteService.deletarCliente(id);
        return ResponseEntity.ok(clienteService.procurarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(
            @PathVariable Long id,
            @RequestBody Cliente cliente)
    {
        clienteService.atualizarCliente(id, cliente);
        return ResponseEntity.ok(cliente);
    }
}
