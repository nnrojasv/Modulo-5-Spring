package com.m5d5.beans;

public class Mejora {

	private int idmejora;
	private String fecha;
	private String motivo;
	private String actividades;
	private String estado;
	private int cliente_id;
	
	public Mejora () {
		
	}
	public Mejora( String fecha, String motivo, String actividades, String aplicado, int idCliente) {
	
		this.fecha = fecha;
		this.motivo = motivo;
		this.actividades = actividades;
		this.estado = aplicado;
		this.cliente_id = idCliente;
	}


	public int getidmejora() {
		return idmejora;
	}


	public void setidmejora(int idmejora) {
		this.idmejora = idmejora;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getActividades() {
		return actividades;
	}


	public void setActividades(String actividades) {
		this.actividades = actividades;
	}





	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	


	public int getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	@Override
	public String toString() {
		return "Mejora [idmejora=" + idmejora + ", fecha=" + fecha + ", motivo=" + motivo + ", actividades="
				+ actividades + ", aplicado=" + estado + ", idCliente=" + cliente_id + "]";
	}
	
	
	

}
