package com.m5d5.beans;

public class Bitacora {

	private String tipo;
	private String clase;
	private String fecha;
	private String mensaje;
	
	public Bitacora(String tipo, String clase, String fecha, String mensaje) {
		this.clase = clase;
		this.tipo = tipo;
		this.fecha = fecha;
		this.mensaje = mensaje;
	}
	
	public String getClase() {
		return clase;
	}
	
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		return "Bitacora [clase=" + clase + ", tipo=" + tipo + ", fecha=" + fecha + ", mensaje=" + mensaje + "]";
	}
	
    public static Bitacora buildFromArray(String[] elementos) {
        
        return new Bitacora (elementos[0],elementos[1],elementos[2],elementos[3]);
         
    }	
}
