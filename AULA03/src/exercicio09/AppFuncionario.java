package exercicio09;

public class AppFuncionario {

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
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Lucca", 10, 18.0);

		System.out.println(funcionario.exibirDados());
		System.out.println("Salário mensal:" + funcionario.calcularSalario());
		
		System.out.println("-----------------------------------------------");
		
		FuncionarioSenior senior = new FuncionarioSenior("Jefferson", 10, 18, 10);
		
		System.out.println(senior.exibirDados());
		System.out.println("Salário mensal:" + senior.calcularSalario());

	}

}
