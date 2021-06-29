package com.mathan.mutimodule.setup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mathan.mutimodule.setup.service.domain.Emp;
import com.mathan.mutimodule.setup.service.repository.EmpRepository;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Emp> emp = empRepository.findUserByStatusAndNameNamedParams(2, "Mathan");
		System.out.println(emp.get(0));
	}

}
