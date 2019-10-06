package br.com.entrevista.controll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.entrevista.models.Diretor;
import br.com.entrevista.models.Filme;

public class Controll {
	
	private static WebDriver driver;

	public Diretor pesquisaFilmeDiretor(Diretor diretor){
		
		for (Filme filme : diretor.getFilmes()) {
			filme.setResultados(searchOnGoogle(diretor.getNome() + " " + filme.getNome()));
		}
		
		return diretor;
	}
	
	
	private String searchOnGoogle(String pesquisa){
		
		String retorno = "";
		
		try {
	
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("http://www.google.com");
			
			WebElement element = driver.findElement(By.name("q"));
			
			//Enviando o dado a ser pesquisado
			element.sendKeys(pesquisa);
			 
			element.submit();
			 
			//Retornando o resultado.
			retorno = driver.findElement(By.id("resultStats")).getText();
			
			//Fechando o driver após o retorno 			
			driver.close();
			driver.quit();
			
		} catch (Exception e) {
			System.out.println("Desculpe!! Ocorreu um erro na hora da pesquisa");
		}
			
		return retorno;
	}	
	
}
