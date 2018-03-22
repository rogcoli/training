package com.training.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.entity.Contato;
import com.training.springboot.service.IContatoService;

@RestController(value = "/contatos")
public class ContatoController {

	@Autowired
	private IContatoService service;

	@RequestMapping(method = RequestMethod.GET)
	public List<Contato> listar() {
		return service.listAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> incluir(@Valid @RequestBody Contato contato) {
		service.save(contato);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Contato contato) {
		service.save(contato);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> apagar(@RequestBody Contato contato) {
		service.delete(contato);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}