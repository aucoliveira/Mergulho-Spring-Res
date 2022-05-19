package com.alga.estudo.domain.repository;

import com.alga.estudo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome); // O containing é o like do sql
    Optional<Cliente> findByEmail(String email);
}
