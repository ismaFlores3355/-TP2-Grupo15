package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Persona {

	private String Nombre;
	private LocalDate Fecha_Nacimiento;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public LocalDate getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	public void Anios_Persona(String fecha) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.Fecha_Nacimiento = LocalDate.parse(fecha, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(Fecha_Nacimiento, ahora);

		System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(),
				periodo.getDays());

	}

	public String Signo_Zodiacal() {

		int dia = Fecha_Nacimiento.getDayOfMonth();
		int mes = Fecha_Nacimiento.getMonthValue();
		String signo = "";
		switch (mes) {
		case 1:
			if (dia > 21) {
				signo = "ACUARIO";
			} else {
				signo = "CAPRICORNIO";
			}
			break;
		case 2:
			if (dia > 19) {
				signo = "PISCIS";
			} else {
				signo = "ACUARIO";
			}
			break;
		case 3:
			if (dia > 20) {
				signo = "ARIES";
			} else {
				signo = "PISCIS";
			}
			break;
		case 4:
			if (dia > 20) {
				signo = "TAURO";
			} else {
				signo = "ARIES";
			}
			break;
		case 5:
			if (dia > 21) {
				signo = "GEMINIS";
			} else {
				signo = "TAURO";
			}
			break;
		case 6:
			if (dia > 20) {
				signo = "CANCER";
			} else {
				signo = "GEMINIS";
			}
			break;
		case 7:
			if (dia > 22) {
				signo = "LEO";
			} else {
				signo = "CANCER";
			}
			break;
		case 8:
			if (dia > 21) {
				signo = "VIRGO";
			} else {
				signo = "LEO";
			}
			break;
		case 9:
			if (dia > 22) {
				signo = "LIBRA";
			} else {
				signo = "VIRGO";
			}
			break;
		case 10:
			if (dia > 22) {
				signo = "ESCORPION";
			} else {
				signo = "LIBRA";
			}
			break;
		case 11:
			if (dia > 21) {
				signo = "SAGITARIO";
			} else {
				signo = "ESCORPION";
			}
			break;
		case 12:
			if (dia > 21) {
				signo = "CAPRICORNIO";
			} else {
				signo = "SAGITARIO";
			}
			break;
		}
		return signo;
	}

	public String Estacion_Año() {
		String estacion = "";
		int dia = Fecha_Nacimiento.getDayOfMonth();
		int mes = Fecha_Nacimiento.getMonthValue();
		
		if ((mes == 3 && dia > 20) || (mes == 4 && dia > 0) || (mes == 5 && dia > 0) || (mes == 6 && dia < 21)) {
			estacion = "Estacion Otoño";
		} else if ((mes == 6 && dia > 20) || (mes == 7 && dia > 0) || (mes == 8 && dia > 0) || (mes == 9 && dia < 21)) {
			estacion = "Estacion Invierno";
		} else if ((mes == 9 && dia > 20) || (mes == 10 && dia > 0) || (mes == 11 && dia > 0)
				|| (mes == 12 && dia < 21)) {
			estacion = "Estacion Primavera";
		} else if ((mes == 12 && dia > 20) || (mes == 1 && dia > 0) || (mes == 2 && dia > 0)
				|| (mes == 3 && dia < 21)) {
			estacion = "Estacion Verano";
		}
		return estacion;

	}

}
