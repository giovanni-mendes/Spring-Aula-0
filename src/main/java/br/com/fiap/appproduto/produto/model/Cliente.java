package br.com.fiap.appproduto.produto.model;

public class Cliente {

	private int id;
	private String nome;
	private String documento;
	private String endereco;
	
	
	public Cliente(int id, String nome, String documento, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
}
