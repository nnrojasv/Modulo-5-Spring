package com.m5d5.beans;

public class Empleado {

	private int idempleado;
	private String nombre;
	private String especialidad;
	
	public Empleado() {
		super();
	}

	public Empleado(int idempleado, String nombre, String especialidad) {
		super();
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}



	public int getIdempleado() {
		return idempleado;
	}



	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", nombre=" + nombre + ", especialidad=" + especialidad + "]";
	}
	
	
	
}
