package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);		
		
		int mes;
		
		
		do {
			System.out.println("Ingrese un numero");
			mes = entrada.nextInt();
			switch(mes) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febreo");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("no existe ese mes");
				break;
			}
		}while(mes<0 && mes>12);

		entrada.close();
	}

}
