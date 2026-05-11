package com.baozi.demo.baozi.repository;

import com.baozi.demo.baozi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}