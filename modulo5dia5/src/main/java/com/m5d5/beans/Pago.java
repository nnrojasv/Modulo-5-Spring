package com.m5d5.beans;

public class Pago {

	private int idpago;
	private String mesanio;
	private int montoregular;
	private int montoadicionales;
	private int cliente_id;
	
	
	public Pago() {
		super();
	}
	
	public Pago(int idpago, String mesanio, int montoregular, int montoadicionales, int cliente_id) {
		this.idpago = idpago;
		this.mesanio = mesanio;
		this.montoregular = montoregular;
		this.montoadicionales = montoadicionales;
		this.cliente_id = cliente_id;
	}



	public int getIdpago() {
		return idpago;
	}



	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}



	public String getMesanio() {
		return mesanio;
	}



	public void setMesanio(String mesanio) {
		this.mesanio = mesanio;
	}



	public int getMontoregular() {
		return montoregular;
	}



	public void setMontoregular(int montoregular) {
		this.montoregular = montoregular;
	}



	public int getMontoadicionales() {
		return montoadicionales;
	}



	public void setMontoadicionales(int montoadicionales) {
		this.montoadicionales = montoadicionales;
	}



	public int getCliente_id() {
		return cliente_id;
	}



	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}



	@Override
	public String toString() {
		return "Pago [idpago=" + idpago + ", mesanio=" + mesanio + ", montoregular=" + montoregular
				+ ", montoadicionales=" + montoadicionales + ", cliente_id=" + cliente_id + "]";
	}
	
	
	
}
