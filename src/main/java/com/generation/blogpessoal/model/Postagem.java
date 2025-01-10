package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity                       // indicar que a classe é uma tabela
@Table(name = "tb_postagens") // indica o nome da tabela de dados
public class Postagem {
	
	
	@Id  //  ele é a chave primária (PRIMARY KEY)
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto incremento
	private Long id;
	
	@NotBlank(message = "Esse campo é obrigatório")  // Not Null("")
	@Size(min =5, max = 100, message = "Digite no mínino 5 e no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "Esse campo é obrigatório")  // Not Null("")
	@Size(min = 10, max = 1000, message = "Digite no mínino 10 e no máximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data; // 10/10/25  18:25:30
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	

}
