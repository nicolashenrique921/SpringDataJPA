package com.example.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pessoa.models.Pessoa;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    // Buscar pessoas com salário maior que o valor informado
    List<Pessoa> findBySalarioGreaterThan(Double salario);

    // Buscar pessoas com salário menor ou igual ao valor informado
    List<Pessoa> findBySalarioLessThanEqual(Double salario);

    // Buscar pessoas cujo nome começa com determinado valor
    List<Pessoa> findByNomeStartingWith(String nome);
}


