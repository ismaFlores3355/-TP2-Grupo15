package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros = 0;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese un numero: ");
			numeros = entrada.nextInt();
			if(numeros%2==0) {
				System.out.println("El numero "+ numeros +" es par: ");
			}else {
				System.out.println("El numero "+ numeros +" es impar");
			}
			
		}
		
		
		entrada.close();
	}

}
