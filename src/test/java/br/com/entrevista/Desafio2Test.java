package br.com.entrevista;


import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Desafio2Test {

	private String url = "https://jsonplaceholder.typicode.com/todos/1";
	
	@Test
	public void Teste() {
		given()
		.relaxedHTTPSValidation()
		.when()
		.get(this.url).then().statusCode(200).contentType(ContentType.JSON)
		.body("userId",is(1))
		.body("id", is(1))
		.body("title", is("delectus aut autem"))
		.body("completed", is(false));
	}
	
	
}
