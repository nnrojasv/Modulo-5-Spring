package com.m5d5.beans;

public class Checklist {

private int idchequeo;
private String detalle;
private String estado;
private int visitas_idvisita;

public Checklist() {}

public Checklist(String detalle, String estado, int visitas_idvisita) {
	super();
	this.detalle = detalle;
	this.estado = estado;
	this.visitas_idvisita = visitas_idvisita;
}

public int getIdchequeo() {
	return idchequeo;
}

public void setIdchequeo(int idchequeo) {
	this.idchequeo = idchequeo;
}

public String getDetalle() {
	return detalle;
}

public void setDetalle(String detalle) {
	this.detalle = detalle;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public int getVisitas_idvisita() {
	return visitas_idvisita;
}

public void setVisitas_idvisita(int visitas_idvisita) {
	this.visitas_idvisita = visitas_idvisita;
}

@Override
public String toString() {
	return "Checklist [idchequeo=" + idchequeo + ", detalle=" + detalle + ", estado=" + estado + ", visitas_idvisita="
			+ visitas_idvisita + "]";
}




}