package ar.edu.unju.fi.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double GRAVEDAD = 9.81;
		System.out.println("Ingrese la altura en metro: ");
		double altura = entrada.nextDouble();
		double resultado = (2 * altura) / GRAVEDAD;
		System.out.println("El tiempo es igual a: " + Math.sqrt(resultado) + " segundos");

		entrada.close();
	}

}
