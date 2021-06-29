package com.mathan.mutimodule.setup.service.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	int sno;
	String 	name;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
}
