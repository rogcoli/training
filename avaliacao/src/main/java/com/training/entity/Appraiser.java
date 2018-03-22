package com.training.entity;

import javax.persistence.Entity;

@Entity
public class Appraiser extends User {

	public Appraiser() {
		super();
	}

	public Appraiser(Long id, String name, String email) {
		super();
		super.setId(id);
		super.setName(name);
		super.setEmail(email);
	}

	public Appraiser(String name, String email) {
		super();

		super.setName(name);
		super.setEmail(email);
	}
}
