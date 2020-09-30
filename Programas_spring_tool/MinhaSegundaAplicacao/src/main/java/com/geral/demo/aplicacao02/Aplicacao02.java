package com.geral.demo.aplicacao02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aplicacao02")
public class Aplicacao02 {

	@GetMapping
	public String aplicacao02() {
		return "Meu Objetivo de aprendizagem para esta semana é trabalhar com Spring Rest interado com o banco de dados MySQL + Postman ";
	}
	
	
	
	
}
