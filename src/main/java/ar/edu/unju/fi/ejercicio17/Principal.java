package ar.edu.unju.fi.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// b.1)
		LocalDate fecha1 = LocalDate.of(2000, 03, 17);
		LocalDate fecha2 = LocalDate.now();

		ProcesoFecha pf1 = new ProcesoFecha(fecha1, fecha2);
		System.out.println(pf1.getFecha1());
		System.out.println(pf1.getFecha2());

		System.out.println(" - - - - - - - - - - - - - - ");
		// b.2) 

		LocalTime tiempo1 = LocalTime.of(10, 55);
		LocalTime tiempo2 = LocalTime.of(22, 50);		
		System.out.println(tiempo1);
		System.out.println(tiempo2);
		
		tiempo1 = tiempo1.plusHours(5);
		tiempo2 = tiempo2.minusMinutes(20);
		
		ProcesoFecha pf2 = new ProcesoFecha(tiempo1,tiempo2);
		
		System.out.println(pf2.getTime1());
		System.out.println(pf2.getTime2());
		
		System.out.println("- - - - - - - - - - - - - - - -");
		// b.3)
		
		System.out.println(pf1.compararFechas());
		System.out.println("- - - - - - - - - - - - - - - - -");
		// b.4) 
		LocalDateTime DataTime1 = LocalDateTime.of(fecha1, tiempo1);
		LocalDateTime DataTime2 = LocalDateTime.of(fecha2, tiempo2);
		ProcesoFecha pf3 = new ProcesoFecha(DataTime1,DataTime2);
		
		System.out.println(pf3.getDateTime1());
		System.out.println(pf3.getDateTime2());
		
		System.out.println("- - - - - - - - - - - - - - - - -");
		// b.5)
		
		ProcesoFecha pf4 = new ProcesoFecha(fecha1,fecha2);
		pf4.contarTiempoTranscurrido(); 
		System.out.println("- - - - - - - - - - - - - -");
		// b.6) correcto
		ProcesoFecha pf5 = new ProcesoFecha();
    	Scanner entrada = new Scanner(System.in);
    	
    	
		System.out.println("Ingrese valores para la fecha (dd/MM/yyyy)");
		String valoresFecha = entrada.next();
		System.out.println("Ingrese otra fecha: (dd/MM/yyyy)");
		String valoresFecha2 = entrada.next();
		
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			// Para fecha 1
			LocalDate fecha_b5 = LocalDate.parse(valoresFecha, formateador);
			pf5.setFecha1(fecha_b5);
			System.out.println(pf5.getFecha1());
			
			LocalDate fecha_b6 = LocalDate.parse(valoresFecha, formateador);
;
			pf5.setFecha1(fecha_b6.plusDays(365));
			System.out.println(pf5.getFecha1());
			
			System.out.println();
			// Para fecha 2
			LocalDate fehca_b4 = LocalDate.parse(valoresFecha2,formateador);
			pf5.setFecha2(fehca_b4);
			System.out.println(pf5.getFecha2());
			
			LocalDate fecha_b7 = LocalDate.parse(valoresFecha2,formateador);
			pf5.setFecha2(fecha_b7.minusMonths(6));
			System.out.println(pf5.getFecha2());
			
		} catch (DateTimeParseException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		entrada.close();
			
	}

}
