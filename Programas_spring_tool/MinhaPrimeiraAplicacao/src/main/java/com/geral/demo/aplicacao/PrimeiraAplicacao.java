package com.geral.demo.aplicacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aplicacao")
public class PrimeiraAplicacao {
	
	@GetMapping
	public String aplicacao() {
		return "Hello Word !!!  Para esta atividade desenvolvi as Mentalidades de PERSISTÊNCIA e MENTALIDADE DE CRESCIMENTO"
				+ " e as Habilidades de ATENÇÃO AOS DETALHES e COMUNICAÇÃO";
	}
	
}
