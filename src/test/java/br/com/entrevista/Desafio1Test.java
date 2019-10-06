package br.com.entrevista;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desafio1Test {

	static WebDriver driver;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Morgan");
		 
		
		element.submit();
		 
		// Mostrando o resultado
		System.out.println("Retorno: " + (driver.findElement(By.id("resultStats")).getText()));
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
		//Fechando o driver após o retorno 
		
		driver.close();
		driver.quit();
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}

}
