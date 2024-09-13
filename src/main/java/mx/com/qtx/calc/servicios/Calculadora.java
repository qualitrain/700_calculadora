package mx.com.qtx.calc.servicios;

public class Calculadora {
	public static <T extends Number> double sumar(T num1, T num2) {
		double resultado =  (num1.doubleValue() + num2.doubleValue());
		return resultado;
	}
	
	public static <T extends Number> double restar(T num1, T num2) {
		double resultado =  (num1.doubleValue() - num2.doubleValue());
		return resultado;
	}
	
	public static <T extends Number> double multiplicar(T num1, T num2) {
		
		return 0;
	}

	public static <T extends Number> double dividir(T num1, T num2) {
		
		return 0;
	}
}
