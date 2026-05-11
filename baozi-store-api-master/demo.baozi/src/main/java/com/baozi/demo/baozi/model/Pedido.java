package com.baozi.demo.baozi.model;

import jakarta.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Long clienteId;
    public Long produtoId;
    public Integer quantidade;
}