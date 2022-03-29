package exercicio08;

import exercicio07.Relogio;

public class AppEbook {

	/*
	 * Considere que voc� est� desenvolvendo um aplicativo de livro eletr�nico. Voc�
	 * deve criar uma classe chamada Ebook com os seguintes atributos: t�tulo,
	 * autor, total de p�ginas e n�mero da p�gina atual. A classe deve ter os
	 * seguintes m�todos: Avan�ar uma p�gina Voltar uma p�gina Mudar para uma p�gina
	 * informada Mostrar o n�mero da p�gina atual Monstrar os dados do livro
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
