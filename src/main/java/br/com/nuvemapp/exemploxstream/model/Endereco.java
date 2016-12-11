package br.com.nuvemapp.exemploxstream.model;

public class Endereco {

	private int numero;
    private String logradouro;
    private String cep;

    public Endereco() {
    }

    public Endereco(int numero, String logradouro, String cep) {
        this.numero = numero;
        this.logradouro = logradouro;
        this.cep = cep;
    }

    public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
