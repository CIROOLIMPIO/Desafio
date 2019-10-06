package br.com.entrevista.view;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import br.com.entrevista.controll.Controll;
import br.com.entrevista.models.Diretor;
import br.com.entrevista.models.Filme;
import br.com.entrevista.vallidation.Validation;

public class View {	
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	  
		Controll control = new Controll();		
		Diretor diretor = new Diretor();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String nome = "";
		String nascimento = "";
		
		boolean outroFilme = true;
		
		try {

			System.out.println("Digite o nome do Diretor");
			nome = getNome();
			
			System.out.println("Digite a data de nascimento do Diretor");
			nascimento = getNascimento();
		   
			diretor.setNome(nome);
			diretor.setNascimento(dateFormat.parse(nascimento));
			
			while (outroFilme) {
				
				int opcao = 0;
				Filme filme = new Filme();
				
				System.out.println("Digite o nome do filme: ");
				filme.setNome(getNomeFilme());
				
				System.out.println("Digite o ano do filme: ");
				filme.setAnoLancamento(getAno());
				
				diretor.addFilmes(filme);
				
				System.out.println("Você gostaria de adicionar mais filmes ao Diretor? Digite 1 para sim e 2 para não");
				opcao = getOpcao();
				
				if(opcao == 1){
					outroFilme = true;		
				} else {
					outroFilme = false;
				}
				
			}
			
			diretor = control.pesquisaFilmeDiretor(diretor);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Retorno: " );
		
		for (Filme filme : diretor.getFilmes()) {
			
			System.out.println("O total de resultados no google do diretor "+ diretor.getNome() +" com o filme " + filme.getNome() + " foram de: " + filme.getResultados());
			
		}
	  
	  }
	
	public static String getNome(){
	
		Scanner scanner = new Scanner(System.in);
		boolean valido = false;
		
		String nome = "";
		
		while (!valido) {
			
			nome = scanner.nextLine();
			valido = Validation.isValidNome(nome);
			
		}
		
		return nome;
	}
	
	public static String getNascimento(){
		
		Scanner scanner = new Scanner(System.in);
		boolean valido = false;
		
		String nascimento = "";
		
		while (!valido) {
			
			nascimento = scanner.nextLine();
			valido = Validation.isValidNascimento(nascimento);
			
		}
		
		return nascimento;
	}
	
	public static String getNomeFilme(){
		
		Scanner scanner = new Scanner(System.in);
		boolean valido = false;
		String nome = "";
		
		while (!valido) {
			nome = scanner.nextLine();
			valido = Validation.isValidNomeFilme(nome);
		}
		
		return nome;
	}
		
	public static String getAno(){
		
		Scanner scanner = new Scanner(System.in);
		boolean valido = false;
		
		String ano = "";
		
		while (!valido) {
			
			ano = scanner.nextLine();
			valido = Validation.isValidAno(ano);
			
		}
		
		return ano;
	}
	
	public static int getOpcao(){
		
		Scanner scanner = new Scanner(System.in);
		boolean valido = false;
		
		int opcao = 0;
		
		while (!valido) {
			
			opcao = scanner.nextInt();
			valido = Validation.isValidOpcao(opcao);
			
		}
		
		return opcao;
	}
}
