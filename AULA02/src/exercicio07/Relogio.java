package exercicio07;

/*Escreva a classe Relógio, com os atributos hora, minuto e segundo, e com um construtor que recebe horas, minutos e segundos para inicializar o relógio.
Faça um método da classe para exibir a hora atual. Crie os getters e setters para os atributos.
Faça um programa (main) que crie um objeto do tipo Relógio e exiba a hora atual do relógio.
O relógio não pode aceitar valores inválidos, ou seja, a hora deve estar entre 0 e 23, o minuto e o segundo devem estar entre 0 e 59.*/

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

	// forma de validação para ter um retorno se o número é valido
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
