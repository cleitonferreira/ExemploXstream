package br.com.nuvemapp.exemploxstream.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("livro") //anotação  para definir o alias
public class Livro4 {

	private int ano;
	private String titulo;
	private String isbn;

	@XStreamOmitField //ignorar a gravação do campo valor no XML
	private double valor;

	public Livro4() {
	}

	public Livro4(int ano, String titulo, String isbn, double valor) {
		this.ano = ano;
		this.titulo = titulo;
		this.isbn = isbn;
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
