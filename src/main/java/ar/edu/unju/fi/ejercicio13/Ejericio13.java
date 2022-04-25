package ar.edu.unju.fi.ejercicio13;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejericio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Empleado persona = new Empleado();

		
		double sueldo = 0;
		System.out.println("Ingrese nombre del Empleado: ");
		String Nombre = entrada.nextLine();
		persona.setNombre(Nombre);
		
		System.out.println("Ingrese Fecha de Ingreso: (dd/MM/yyyy)");
		String fecha = entrada.nextLine();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		try {
			LocalDate fecha_b1 = LocalDate.parse(fecha, formateador);
			persona.setFecha_Ingreso(fecha_b1);

		}catch (Exception e){
			System.out.println("invalid format");
		}
		
		
		System.out.println("Ingrese su legajo: ");
		int legajo = entrada.nextInt();
		persona.setLegajo(legajo);
		
		System.out.println("Ingrese email: ");
		String email = entrada.next();
		persona.setEmail(email);
		
		System.out.println("Ingrese horas trabajadas: ");
		int horas = entrada.nextInt();
		persona.setHoras_Trabajadas(horas);
		
		
		if(horas>0 && horas <= 160) {
			sueldo = horas * 600;
		}else if(horas > 160){
			sueldo = 96000 + (horas * 650);
		}else {
			System.out.println("No posee horas trabajadas");
			sueldo = 0;
		}
		persona.setSueldo(sueldo);
		
		System.out.println("Nombre : " + persona.getNombre());
		System.out.println("Ingreso: " + persona.getFecha_Ingreso());
		System.out.println("Legajo: " + persona.getLegajo());
		System.out.println("Email: " + persona.getEmail());
		System.out.println("Horas trabajadas: " + persona.getHoras_Trabajadas());
		System.out.println("Sueldo: " + persona.getSueldo());
			
		entrada.close();
	}

}
