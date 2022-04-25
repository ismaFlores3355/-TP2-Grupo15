package ar.edu.unju.fi.ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 40;
		for (int i = 2; j > 0; i += 2) {
			if (i == 2) {
				j += j;
				System.out.print(j + " ");
				i++;
			}
			if (i <= 40) {
				j = 40 + j - i;
				System.out.print(j + " ");
			} else {
				j += 40 - i;
				System.out.print(j + " ");
			}
		}
	}

}
