package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculadora;

public class CalculadoraTest {

	// Criando atributo para ser usado no metodo de repara��o
	private Calculadora c;

	// primeiro teste
	/*
	 * @Test public void deveRetornarSomaDosValores() { Calculadora c = new
	 * Calculadora();
	 * 
	 * double resultado = c.somar(10, 20);
	 * 
	 * assertEquals(30, resultado, "Soma"); }
	 */

	@BeforeEach
	public void preparacaoTestes() {
		// neste caso a calucladora deve ser um atributo e n�o uma variavel como no
		// exemplo anterior

		c = new Calculadora();
	}

	@Test // marca��o para informar que trata-se de teste
	public void deveRetornarSomaDosNumeros() {

		// importar a classe da Calculadora

		// Calculadora s = new Calculadora(); est� sendo criado pelo metodo
		// PreparacaoTestes()

		// valida a soma
		double resultado = c.somar(10, 20);

		// teste informar o que deve ter o resultado
		assertEquals(30, resultado, "Soma");

	}

	@Test
	public void deveRetornarDiferencaDosNumeros() {

		// valida subtra��o
		double resultado = c.subtrair(20, 10);

		assertEquals(10, resultado, "Subtrair");
	}
	
	@Test
	public void deveRetornarMultiplicacapDosNumeros() {

		// valida subtra��o
		double resultado = c.multiplicar(2, 10);

		assertEquals(20, resultado, "Multiplicar");
	}
	
	@Test
	public void deveRetornarDivisaoDosNumeros() {

		// valida subtra��o
		double resultado = c.divisao(10, 2);

		assertEquals(5, resultado, "Dividir");
	}
	
	@Test
	public void deveRetornarValorNegativoQuandoDivisorZero() {

		// valida subtra��o
		double resultado = c.divisao(20, 0);

		assertEquals(-1, resultado, "Dividir");
	}
	
}
