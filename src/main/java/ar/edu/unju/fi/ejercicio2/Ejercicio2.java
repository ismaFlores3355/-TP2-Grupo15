package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un año: ");
		int numero = entrada.nextInt();

		if ((numero % 4 == 0) && (numero % 100 != 0) || (numero % 400 == 0)) {
			System.out.println("El año es bisiesto");
		} else {
			System.out.println("El año no es bisiesto");
		}
		entrada.close();
		
	}
}
