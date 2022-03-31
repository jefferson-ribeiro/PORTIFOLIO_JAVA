package main;

public class Calculadora {

	// Primeiro teste
	/*
	 * public double somar(double n1, double n2) { return n1 + n2; }
	 */

	public double somar(double n1, double n2) {

		return n1 + n2;
	}

	public double subtrair(double n1, double n2) {

		return n1 - n2;
	}

	public double multiplicar(double n1, double n2) {

		return n1 * n2;
	}

	public double divisao(double n1, double n2) {

		if (n1 == 0) {
			return -1;
		}
		return n1 / n2;

	}
}
