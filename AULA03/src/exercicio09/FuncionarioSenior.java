package exercicio09;

public class FuncionarioSenior extends Funcionario {

	private double bonus;

	public FuncionarioSenior(String nome, int horasTrabalho, double valorHora, double bonus) {
		super(nome, horasTrabalho, valorHora);
		this.bonus = bonus;

	}

	@Override // documenta que esta reescrevendo uma classe
	public double calcularSalario() {
		return super.calcularSalario() + (getHorasTrabalho() / 10) * bonus;

	}

	@Override
	public String exibirDados() {
		return super.exibirDados() + "," + bonus;
	}

}
