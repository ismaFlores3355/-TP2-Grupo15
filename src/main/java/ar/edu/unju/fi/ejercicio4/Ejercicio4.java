package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		boolean bandera = true;
		
		while(bandera) {
			System.out.println("Ingrese un numero: ");
			int numero = entrada.nextInt();
			if((numero>0) && (numero<13)) {
				System.out.println("Corresponde a un mes del año");
			}else {
				System.out.println("No corresponde a un mes del año");
				bandera= false;
			}
		}
		
		entrada.close();
	}

}
