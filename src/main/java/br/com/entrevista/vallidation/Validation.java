package br.com.entrevista.vallidation;

import java.text.SimpleDateFormat;


public class Validation {

	
	public static boolean isValidNome(String nome){
				
		if(nome.matches("^[a-zA-Z\u00C0-\u00FF ]*$")){
			return true;
		} else { 
			System.out.println("Observação: Apenas letras e espaços. Tente outra vez:");
			return false;
		}
		
	}
	
	public static boolean isValidNomeFilme(String nome){
		
		if(!"".equals(nome) || nome!=null){
			return true;
		} else { 
			System.out.println("Observação: Nome não pode ser vazio. Tente outra vez:");
			return false;
		}
		
	}
	
	
	public static boolean isValidNascimento(String nascimento){
		if (nascimento == null || !nascimento.matches("[0-9]{1,2}(/|-)[0-9]{1,2}(/|-)[0-9]{4}")){
			System.out.println("Observação: Nascimento deve ser dessa dorma DD/MM/YYYY. Tente outra vez:");   
			return false;
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			dateFormat.parse(nascimento);
			return true;
		} catch (Exception e) {
			System.out.println("Observação: Nascimento deve ser dessa dorma DD/MM/YYYY. Tente outra vez:");
			return false;
		}
		
	}
	
	public static boolean isValidAno(String ano){
		if (!ano.matches("[0-9]{4}")){
			System.out.println("Observação: Ano de lançamento deve ser dessa dorma YYYY. Tente outra vez:");   
			return false;
		} else {
			return true; 
		}
		
	}
	
	public static boolean isValidOpcao(int opcao){
		
		
		if (opcao < 1 && opcao > 2  ){
			System.out.println("Opcão errada. Tente outra vez:");   
			return false;
		} else {
			return true; 
		}
		
	}
	
	
}
