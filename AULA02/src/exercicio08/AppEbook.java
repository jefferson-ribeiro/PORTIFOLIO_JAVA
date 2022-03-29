package exercicio08;

import exercicio07.Relogio;

public class AppEbook {

	/*
	 * Considere que você está desenvolvendo um aplicativo de livro eletrônico. Você
	 * deve criar uma classe chamada Ebook com os seguintes atributos: título,
	 * autor, total de páginas e número da página atual. A classe deve ter os
	 * seguintes métodos: Avançar uma página Voltar uma página Mudar para uma página
	 * informada Mostrar o número da página atual Monstrar os dados do livro
	 */

	public static void main(String[] args) {

		// Criar um livro
		Ebook livro = new Ebook("Machado de Assis", "Dom Casmurro", 236);

		// mostrar dados do livro
		System.out.println(livro.DadosLivro());

		// avancar pagina
		livro.Avancar();
		livro.Avancar();
		// numero pagina atual
		System.out.println(livro.getNumPagAtual());

		// voltar pagina
		livro.Voltar();
		livro.Voltar();
		livro.Voltar();
		// numero pagina atual
		System.out.println(livro.getNumPagAtual());

		// Mudar para a pagina informada
		livro.Mudar(200);
		System.out.println(livro.getNumPagAtual());

	}

}
