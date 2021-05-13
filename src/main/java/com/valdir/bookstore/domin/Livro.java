package com.valdir.bookstore.domin;

public class Livro {

	private Integer aid;
	private string titulo;
	private string nome_autor;
	private string texto;

	private Categoria categoria;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer aid, string titulo, string nome_autor, string texto, Categoria categoria) {
		super();
		this.aid = aid;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public string getTitulo() {
		return titulo;
	}

	public void setTitulo(string titulo) {
		this.titulo = titulo;
	}

	public string getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(string nome_autor) {
		this.nome_autor = nome_autor;
	}

	public string getTexto() {
		return texto;
	}

	public void setTexto(string texto) {
		this.texto = texto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aid == null) ? 0 : aid.hashCode());
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
		Livro other = (Livro) obj;
		if (aid == null) {
			if (other.aid != null)
				return false;
		} else if (!aid.equals(other.aid))
			return false;
		return true;
	}

}
