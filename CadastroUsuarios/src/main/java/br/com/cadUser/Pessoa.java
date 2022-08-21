package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
//import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named("Pessoa")
public class Pessoa {
	
	private String nome;
	
	private List<String> nomes = new ArrayList<String>();
	
	public String insereUser() {
		nomes.add(nome);
		return "";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
}
