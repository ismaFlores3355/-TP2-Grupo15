package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Ejericio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int factorial = 1;
		System.out.println("Ingrese un valor para calcular el factorial: ");
		int numero = entrada.nextInt();

		while (numero != 0) {
			factorial *= numero;
			numero -= 1;
		}

		System.out.println("El factorial es: " + factorial);
		entrada.close();
	}

}
