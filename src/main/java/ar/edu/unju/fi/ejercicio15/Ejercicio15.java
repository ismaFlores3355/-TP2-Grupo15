package ar.edu.unju.fi.ejercicio15;


import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		Persona humano = new Persona();
		
		System.out.println("Ingrese su fecha de nacimiento: (dd/MM/yyyy) ");
		String fecha_Nac = entrada.next();	
		humano.Anios_Persona(fecha_Nac);
		System.out.println("\n" + humano.Signo_Zodiacal());
		System.out.println(humano.Estacion_Año());
		
		entrada.close();
	}

}
