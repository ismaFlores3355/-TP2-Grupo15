package ar.edu.unju.fi.ejercicio13;

import java.time.LocalDate;

public class Empleado {

	private String Nombre;
	private LocalDate Fecha_Ingreso;
	private int Legajo;
	private String Email;
	private double Sueldo;
	private int Horas_Trabajadas;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public LocalDate getFecha_Ingreso() {
		return Fecha_Ingreso;
	}

	public void setFecha_Ingreso(LocalDate fecha_Ingreso) {
		Fecha_Ingreso = fecha_Ingreso;
	}

	public int getLegajo() {
		return Legajo;
	}

	public void setLegajo(int legajo) {
		Legajo = legajo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}

	public int getHoras_Trabajadas() {
		return Horas_Trabajadas;
	}

	public void setHoras_Trabajadas(int horas_Trabajadas) {
		Horas_Trabajadas = horas_Trabajadas;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", Fecha_Ingreso=" + Fecha_Ingreso + ", Legajo=" + Legajo + ", Email="
				+ Email + ", Sueldo=" + Sueldo + ", Horas_Trabajadas=" + Horas_Trabajadas + "]";
	}

}
