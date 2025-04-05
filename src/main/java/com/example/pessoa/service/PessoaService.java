package com.example.pessoa.service;

import org.springframework.stereotype.Service;

import com.example.pessoa.models.Pessoa;
import com.example.pessoa.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {
    
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> getPessoasComSalarioMaiorQue(Double salario) {
        return pessoaRepository.findBySalarioGreaterThan(salario);
    }

    public List<Pessoa> getPessoasComSalarioMenorOuIgual(Double salario) {
        return pessoaRepository.findBySalarioLessThanEqual(salario);
    }

    public List<Pessoa> getPessoasPorNome(String nome) {
        return pessoaRepository.findByNomeStartingWith(nome);
    }

    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}

