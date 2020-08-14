package br.com.elias.model;

import java.io.Serializable;

public class JwtRequest implements Serializable{
	private static final long serialVersionUID = 5926468583005150707L;
	
	private String nome;
	private String password;
	
	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}

	public JwtRequest(String nome, String password) {
		this.setNome(nome);
		this.setPassword(password);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	


}
