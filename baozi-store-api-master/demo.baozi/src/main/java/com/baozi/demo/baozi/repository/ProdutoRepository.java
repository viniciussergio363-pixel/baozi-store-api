package com.baozi.demo.baozi.repository;

import com.baozi.demo.baozi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}