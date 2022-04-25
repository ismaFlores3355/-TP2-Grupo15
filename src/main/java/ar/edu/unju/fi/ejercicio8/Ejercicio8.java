package ar.edu.unju.fi.ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 4;
		int contador = 2;
		int resultado = 4;
		do {
			System.out.print(resultado + " ");
			resultado = numero * contador;
			contador = contador + 1;
		} while (resultado < 101);
	}

}
