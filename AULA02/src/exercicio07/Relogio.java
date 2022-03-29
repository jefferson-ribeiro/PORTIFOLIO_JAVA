package exercicio07;

/*Escreva a classe Rel�gio, com os atributos hora, minuto e segundo, e com um construtor que recebe horas, minutos e segundos para inicializar o rel�gio.
Fa�a um m�todo da classe para exibir a hora atual. Crie os getters e setters para os atributos.
Fa�a um programa (main) que crie um objeto do tipo Rel�gio e exiba a hora atual do rel�gio.
O rel�gio n�o pode aceitar valores inv�lidos, ou seja, a hora deve estar entre 0 e 23, o minuto e o segundo devem estar entre 0 e 59.*/

public class Relogio {

	private int hora, minutos, segundos;

	Relogio(int hora, int minutos, int segundos) {
		this.setHora(hora);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
	}

	public int getHora() {
		return hora;
	}

	public Boolean setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
			return true;
		} else {
			return false;
		}

	}

	public int getMinutos() {
		return minutos;
	}

	// forma de valida��o para ter um retorno se o n�mero � valido
	public Boolean setMinutos(int minutos) {
		if (minutos > 0 && minutos < 60) {
			this.minutos = minutos;
			return true;
		}
		return false;
	}

	public int getSegundos() {
		return segundos;
	}

	public Boolean setSegundos(int segundos) {
		if (segundos > 0 && segundos < 60) {
			this.segundos = segundos;
			return true;
		} else {
			return false;
		}
	}

	public String getHoraAtual() {
		return hora + " : " + minutos + " : " + segundos;

	}

}
