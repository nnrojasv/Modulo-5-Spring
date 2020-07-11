package com.m5d5.beans;

public class Capacitacion {

private int idcapacitacion;
private String fecha;
private String hora;
private int numasistentes;
private int visitas_idvisita;

public Capacitacion() {}

public Capacitacion(String fecha, String hora, int numasistentes, int visitas_idvisita) {
	super();
	this.fecha = fecha;
	this.hora = hora;
	this.numasistentes = numasistentes;
	this.visitas_idvisita = visitas_idvisita;
}

public int getIdcapacitacion() {
	return idcapacitacion;
}

public void setIdcapacitacion(int idcapacitacion) {
	this.idcapacitacion = idcapacitacion;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

public int getNumasistentes() {
	return numasistentes;
}

public void setNumasistentes(int numasistentes) {
	this.numasistentes = numasistentes;
}

public int getVisitas_idvisita() {
	return visitas_idvisita;
}

public void setVisitas_idvisita(int visitas_idvisita) {
	this.visitas_idvisita = visitas_idvisita;
}

@Override
public String toString() {
	return "Capacitacion [idcapacitacion=" + idcapacitacion + ", fecha=" + fecha + ", hora=" + hora + ", numasistentes="
			+ numasistentes + ", visitas_idvisita=" + visitas_idvisita + "]";
}


}