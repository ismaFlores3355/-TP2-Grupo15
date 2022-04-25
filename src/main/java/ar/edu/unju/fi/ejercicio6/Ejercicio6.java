package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 1;
		Scanner entrada = new Scanner(System.in);
		while (nota > 0) {
			System.out.println("Ingrese una nota: ");
			nota = entrada.nextInt();
			if (nota == 6) {
				System.out.println("Alumno regulariza");
			} else {
				if ((nota > 6) && (nota < 10)) {
					System.out.println("Alumno promociona");
				} else {
					if (((nota < 6) && (nota > 1)) || (nota == 1)) {
						System.out.println("El alumno desaprueba");
					} else {
						if (nota < 0) {
							System.out.println("valor no permitido");
						}
					}
				}
			}
		}
		entrada.close();
	}

}
