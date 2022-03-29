package exercicio08;

public class Ebook {

	private String titulo, autor;
	private int totalPag, numPagAtual;

	public Ebook(String titulo, String autor, int totalPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		if (totalPag > 0) {
			this.numPagAtual = numPagAtual;
		}

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPag() {
		return totalPag;
	}

	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}

	public int getNumPagAtual() {
		return numPagAtual;
	}

	public void setNumPagAtual(int numPagAtual) {
		this.numPagAtual = numPagAtual;
	}

	public void Avancar() {
		// Avançar uma página
		if (numPagAtual < totalPag) {
			numPagAtual++;
		}

	}

	public void Voltar() {
		// Voltar uma página
		if (numPagAtual > 0) {
			numPagAtual--;
		}

	}

	public Boolean Mudar(int pagina) {
		if (pagina >= 0 && pagina <= totalPag) {
			numPagAtual = pagina;
			return true;
		}
		return false;
	}

	public void Mostrar() {
		this.getNumPagAtual();
		return;
	}

	public String DadosLivro() {
		return "Titulo: " + titulo + " Autor: " + autor + " Total de Paginas: " + totalPag;

	}

}
