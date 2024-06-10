package com.spring.demo.controller;

import com.spring.demo.model.Pessoa;
import com.spring.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/cadastrar")
    public Pessoa savePessoa(@RequestBody Pessoa newPessoa) {
        Pessoa pessoaCadastrada = pessoaService.cadastrarPessoa(newPessoa);
        return pessoaCadastrada;
    }

    @GetMapping("/listar")
    public List<Pessoa> fildAll() {
        return pessoaService.litarTodasPessoas();
    }

    @GetMapping("/getId")
    public Pessoa findById(@RequestParam Long id) {
        return pessoaService.buscarPorId(id);
    }

    @DeleteMapping
    public String deletarPessoa(@RequestParam Long id) {
        return pessoaService.deletarPorId(id);
    }

}
