package br.com.entrevista.models;


public class Filme {

	private String nome;
	private String anoLancamento;
	private String resultados;
	
	public Filme() {
		super();
	}

	public Filme(String nome, String anoLancamento) {
		super();
		this.nome = nome;
		this.anoLancamento = anoLancamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getResultados() {
		return resultados;
	}

	public void setResultados(String resultados) {
		this.resultados = resultados;
	}
	
}
