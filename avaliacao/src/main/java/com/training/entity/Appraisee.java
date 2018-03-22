package com.training.entity;

import javax.persistence.Entity;

@Entity
public class Appraisee extends User {

	public Appraisee() {
		super();
	}

	public Appraisee(Long id, String name, String email) {
		super();
		super.setId(id);
		super.setName(name);
		super.setEmail(email);
	}

	public Appraisee(String name, String email) {
		super();

		super.setName(name);
		super.setEmail(email);
	}

}
