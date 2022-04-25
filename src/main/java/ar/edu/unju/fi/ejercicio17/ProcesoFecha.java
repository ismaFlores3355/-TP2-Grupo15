package ar.edu.unju.fi.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {

	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime dateTime1;
	private LocalDateTime dateTime2;

	public ProcesoFecha() {
		super();
	}

	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	}

	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	public LocalDate getFecha1() {
		return fecha1;
	}

	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}

	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	public LocalTime getTime1() {
		return time1;
	}

	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	public LocalTime getTime2() {
		return time2;
	}

	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	public LocalDateTime getDateTime1() {
		return dateTime1;
	}

	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	public LocalDateTime getDateTime2() {
		return dateTime2;
	}

	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	public Period contarTiempoTranscurrido() {
			
		Period periodo = Period.between(fecha1, fecha2);
		System.out.println("han transcurrido " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y "
				+ periodo.getDays() + " días " + "desde la fecha " + formatearFecha(this.fecha1) + " hasta la fecha " + formatearFecha(this.fecha2) );
		return periodo;
		
	}
	public String formatearFecha(LocalDate fecha) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String resultado = formato.format(fecha);
		/*String formattedDate = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return formattedDate;*/
		return resultado;
		
	}
	public String compararFechas() {
			
		if(fecha1.compareTo(fecha2) > 0) {
			return "La fecha " + this.fecha1 + " es posterior a la fecha " + this.fecha2;
		}else if(fecha1.compareTo(fecha2) < 0){
			return "La fecha " + formatearFecha(this.fecha1) + " es anterior a la fecha " + formatearFecha(this.fecha2);
		}else {
			return "Las fechas son iguales";
		}
	}
	
}
