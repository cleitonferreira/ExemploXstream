package br.com.nuvemapp.exemploxstream.model;

public class Editora {

	private String nome;
    private Endereco endereco;

    public Editora() {
    }

    public Editora(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
