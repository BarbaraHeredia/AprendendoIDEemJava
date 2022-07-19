package br.com.dio;

import br.com.dio.model.Gato;

public class AprendendoEmJava {

	public static void main(String[] args) {
		
		/*int a = 7;
		int b = 10;
		
		System.out.println("Hello Word!!" + (a+b)); */
		
		Gato gato = new Gato(null, null, null);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);

	}

}

class Livros{
	
	private String nome;
	private String numpags;
}
