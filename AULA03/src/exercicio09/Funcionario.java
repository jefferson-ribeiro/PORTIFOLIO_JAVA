package exercicio09;

/*
 * // Contruir uma classe para representar um funcionário com os seguintes
 * atrubutos: nome, horas trabalhadas e valor pago por hora trabalhada.
 * Implementar um método para calcular e retornar o salario final de um
 * funcionario e um metodo para exibir os dados do funcionario
 * 
 * Criar uma subclasse para repesentar um funcionario senior. A Diferenca entre
 * eles é que o senior recebe um bonus a cada 10 horas trabalhadas O bonus é
 * atributo do funcionario senior. Sobrescreva os metodos calcularSalario() e
 * exibirDados() para esta regra
 * 
 * Criar AppFuncionario para instanciar objetos da classe funcionario e senior e
 * chamar os metodos
 */

public class Funcionario {
	// Atributos do funcionario
	private String nome;
	private int horasTrabalho;
	private double valorHora;

	// contrutor com as informações necessárias para criar um funcionário
	public Funcionario(String nome, int horasTrabalho, double valorHora) {
		super();
		this.nome = nome;
		setHorasTrabalho(horasTrabalho);
		setValorHora(valorHora);
	}

	// Getters e Setters para acessar atributos privados
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalho() {
		return horasTrabalho;
	}

	public void setHorasTrabalho(int horasTrabalho) {
		if (horasTrabalho > 0) {
			this.horasTrabalho = horasTrabalho;
		}

	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		if (valorHora > 0) {
			this.valorHora = valorHora;
		}

	}

	public double calcularSalario() {
		return horasTrabalho * valorHora;
	}

	public String exibirDados() {
		return "Nome: " + nome + " Horas trabalho por dia: " + horasTrabalho + " Valor da hora: " + valorHora;

	}

}
