package com.example.pessoa.controller;

import org.springframework.web.bind.annotation.*;

import com.example.pessoa.models.Pessoa;
import com.example.pessoa.service.PessoaService;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.salvarPessoa(pessoa);
    }

    @GetMapping("/salario-maior/{valor}")
    public List<Pessoa> getPessoasSalarioMaior(@PathVariable Double valor) {
        return pessoaService.getPessoasComSalarioMaiorQue(valor);
    }

    @GetMapping("/salario-menor-ou-igual/{valor}")
    public List<Pessoa> getPessoasSalarioMenorOuIgual(@PathVariable Double valor) {
        return pessoaService.getPessoasComSalarioMenorOuIgual(valor);
    }

    @GetMapping("/nome/{nome}")
    public List<Pessoa> getPessoasPorNome(@PathVariable String nome) {
        return pessoaService.getPessoasPorNome(nome);
    }
}

