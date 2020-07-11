package com.m5d5.beans;

public class Accidente {

private int idaccidente;
private String fecha;
private String hora;
private String suceso;
private String lugar;
private int cliente_id;

public Accidente() {}

public Accidente( String fecha, String hora, String suceso, String lugar, int idCliente) {
	this.fecha = fecha;
	this.hora = hora;
	this.suceso = suceso;
	this.lugar = lugar;
	this.cliente_id = idCliente;
}

public int getIdaccidente() {
	return idaccidente;
}

public void setIdaccidente(int idAccidente) {
	this.idaccidente = idAccidente;
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

public String getSuceso() {
	return suceso;
}

public void setSuceso(String suceso) {
	this.suceso = suceso;
}

public String getLugar() {
	return lugar;
}

public void setLugar(String lugar) {
	this.lugar = lugar;
}

public int getcliente_id() {
	return cliente_id;
}

public void setcliente_id(int idCliente) {
	this.cliente_id = idCliente;
}

@Override
public String toString() {
	return "Accidente [idAccidente=" + idaccidente + ", fecha=" + fecha + ", hora=" + hora + ", suceso=" + suceso
			+ ", lugar=" + lugar + ", idCliente=" + cliente_id + "]";
}




}
