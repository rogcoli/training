package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
