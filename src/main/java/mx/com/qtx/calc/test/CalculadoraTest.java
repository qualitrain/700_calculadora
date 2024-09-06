package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		test_sumar_enteros();
		test_restar_enteros();
	}	

	public static void test_sumar_enteros() {
		System.out.println("\ntest_sumar_enteros\n");
		int n = (int) Calculadora.sumar(5, 5);
		System.out.println("n = " + n);		
	}

	private static void test_restar_enteros() {
		System.out.println("\ntest_restar_enteros\n");
		int n = (int) Calculadora.restar(500, 5);
		System.out.println("n = " + n);		
	}
}
