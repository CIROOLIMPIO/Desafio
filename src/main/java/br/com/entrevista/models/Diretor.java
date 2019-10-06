
package br.com.entrevista.models;

import java.util.ArrayList;
import java.util.Date;

public class Diretor {

	private String nome;
	private Date nascimento;
	private ArrayList<Filme> filmes;
	
	public Diretor() {
		super();
		this.filmes = new ArrayList<Filme>();
	}
	
	public Diretor(String nome, Date nascimento, ArrayList<Filme> filmes) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.filmes = filmes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Filme> filmes) {
		this.filmes = filmes;
	}
	
	
	public void addFilmes(Filme filme){
		this.filmes.add(filme);
	}
}
