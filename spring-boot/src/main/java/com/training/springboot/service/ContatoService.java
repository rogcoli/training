package com.training.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.entity.Contato;
import com.training.springboot.repository.ContatoRepository;

@Service
public class ContatoService implements IContatoService {

	@Autowired
	private ContatoRepository repository;

	@Override
	public void save(Contato contato) {
		repository.save(contato);
	}

	@Override
	public List<Contato> listAll() {
		return repository.findAll();
	}

	@Override
	public void update(Contato contato) {
		repository.save(contato);
	}

	@Override
	public void delete(Contato contato) {
		repository.delete(contato);
	}

}
