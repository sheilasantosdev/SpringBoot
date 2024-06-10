package com.spring.demo.service;

import com.spring.demo.model.Pessoa;
import com.spring.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa cadastrarPessoa(Pessoa novaPessoa) {
        return pessoaRepository.save(novaPessoa);
    }

    public List<Pessoa> litarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id).get();
    }

    public String deletarPorId(Long id) {
        pessoaRepository.deleteById(id);
        return "Pessoa deletada!";
    }
}

