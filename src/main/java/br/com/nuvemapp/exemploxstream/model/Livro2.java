package br.com.nuvemapp.exemploxstream.model;

public class Livro2 {

	private int ano;
    private String titulo;
    private String isbn;
    private Editora editora;

    public Livro2() {
    }

    public Livro2(int ano, String titulo, String isbn, Editora editora) {
        this.ano = ano;
        this.titulo = titulo;
        this.isbn = isbn;
        this.editora = editora;
    }

    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
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
}
