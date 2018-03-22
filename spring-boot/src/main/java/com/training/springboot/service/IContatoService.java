package com.training.springboot.service;

import java.util.List;

import com.training.springboot.entity.Contato;

public interface IContatoService {

	List<Contato> listAll();

	void save(Contato contato);

	void delete(Contato contato);

	void update(Contato contato);

}
