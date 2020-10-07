package com.MinhaLojaDeGames.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.SEQUENCE) // auto increment
		private Long id;
		
		@Column
		private String name;
		
		@Column
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date data;
	
		@OneToMany(mappedBy="categoria", cascade=CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produtos;
		
		//----//
		
	

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public List<Produto> getProdutos() {
			return produtos;
		}

		public void setProdutos(List<Produto> produtos) {
			this.produtos = produtos;
		}
		
	
}
