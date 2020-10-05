package com.MinhaEscola;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {

	public List<AlunoModel> findByNome (String nome);
	
}
