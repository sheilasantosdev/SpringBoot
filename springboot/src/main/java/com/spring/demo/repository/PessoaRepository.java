package com.spring.demo.repository;

import com.spring.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}