package com.baozi.demo.baozi.controller;

import com.baozi.demo.baozi.model.Pedido;
import com.baozi.demo.baozi.repository.PedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoRepository repo;

    public PedidoController(PedidoRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return repo.save(pedido);
    }

    @GetMapping
    public List<Pedido> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}