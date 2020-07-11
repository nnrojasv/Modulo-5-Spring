package com.m5d5.beans;

public class Visita {
	
	private int idvisita;
	private String direccion;
	private String ciudad;
	private String fecha;
	private String resumen;
	private String observaciones;
	private int cliente_id;
	private int empleado_idempleado;
	
	
	public Visita(){
		
	}
	public Visita( String direccion, String ciudad, String fecha, String observaciones, String resumen,
			int cliente_id, int empleado_idempleado) {

		this.direccion = direccion;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.observaciones = observaciones;
		this.resumen = resumen;
		this.cliente_id = cliente_id;
		this.empleado_idempleado = empleado_idempleado;
	}


	public int getidvisita() {
		return idvisita;
	}


	public void setidvisita(int idvisita) {
		this.idvisita = idvisita;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String getResumen() {
		return resumen;
	}


	public void setResumen(String resumen) {
		this.resumen = resumen;
	}


	public int getcliente_id() {
		return cliente_id;
	}


	public void setcliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}


	public int getempleado_idempleado() {
		return empleado_idempleado;
	}


	public void setempleado_idempleado(int empleado_idempleado) {
		this.empleado_idempleado = empleado_idempleado;
	}


	@Override
	public String toString() {
		return "Visita [idvisita=" + idvisita + ", direccion=" + direccion + ", ciudad=" + ciudad + ", fecha=" + fecha
				+ ", observaciones=" + observaciones + ", resumen=" + resumen + ", cliente_id=" + cliente_id
				+ ", empleado_idempleado=" + empleado_idempleado + "]";
	}
	
	
	
	
	
	
		



}
