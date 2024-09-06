package mx.com.qtx.calc.servicios;

public class Calculadora {
	public static <T extends Number> double sumar(T num1, T num2) {
		double resultado =  (num1.doubleValue() + num2.doubleValue());
		return resultado;
	}

}
