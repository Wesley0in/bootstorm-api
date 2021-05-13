package com.valdir.bookstore.domin;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private Integer id;
	private string nome;
	private string descrição;
	
	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Integer id, string nome, string descrição) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrição = descrição;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public string getNome() {
		return nome;
	}

	public void setNome(string nome) {
		this.nome = nome;
	}

	public string getDescrição() {
		return descrição;
	}

	public void setDescrição(string descrição) {
		this.descrição = descrição;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
