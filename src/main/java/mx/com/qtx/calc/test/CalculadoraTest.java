package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		int n = (int) Calculadora.sumar(5, 5);
		System.out.println("n = " + n);
	}

}
