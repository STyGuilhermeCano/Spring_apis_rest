package com.MinhaEscola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class AlunoController {


	@Autowired
	private AlunoRepository repository;
	
	
	@GetMapping("/alunos")
	public List<AlunoModel> pegarTodos() { 
		
		return repository.findAll(); 
	}
	
	
	@PostMapping("/alunos")
	public AlunoModel criar(@RequestBody AlunoModel aluno) {
		repository.save(aluno);
		return aluno;
	}
	
	@GetMapping("/alunos/nome/{id}")
	public Object buscarPorId(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PutMapping("/alunos/{id}")
	public AlunoModel atualizar(@PathVariable Long id, @RequestBody AlunoModel aluno) {
		aluno.setId(id);
		repository.save(aluno);
		return aluno;
	}
	
	@DeleteMapping("/alunos/{id}")
	public String remover(@PathVariable Long id) {
		repository.deleteById(id);
		return "sucesso";
	}
	
	
}
