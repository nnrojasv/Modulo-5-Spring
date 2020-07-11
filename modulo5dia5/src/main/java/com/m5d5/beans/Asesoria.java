package com.m5d5.beans;

public class Asesoria  {

	private int idasesoria;
	private String detalle;
	private String gestion;
	private String propuestas;
	private String fecha;
	private String especial;
	private int visitas_idvisita;
	
	public Asesoria() {
	
	}

	public Asesoria(String detalle, String gestion, String propuestas, String fecha, String especial,
			int visitas_idvisita) {
	
		this.detalle = detalle;
		this.gestion = gestion;
		this.propuestas = propuestas;
		this.fecha = fecha;
		this.especial = especial;
		this.visitas_idvisita = visitas_idvisita;
	}





	public int getidasesoria() {
		return idasesoria;
	}


	public void setidasesoria(int idasesoria) {
		this.idasesoria = idasesoria;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public String getGestion() {
		return gestion;
	}


	public void setGestion(String gestion) {
		this.gestion = gestion;
	}


	public String getpropuestas() {
		return propuestas;
	}


	public void setpropuestas(String propuestas) {
		this.propuestas = propuestas;
	}


	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getespecial() {
		return especial;
	}


	public void setespecial(String especial) {
		this.especial = especial;
	}


	public int getvisitas_idvisita() {
		return visitas_idvisita;
	}


	public void setvisitas_idvisita(int idVisita) {
		this.visitas_idvisita = idVisita;
	}

	@Override
	public String toString() {
		return "Asesoria [idasesoria=" + idasesoria + ", detalle=" + detalle + ", gestion=" + gestion + ", propuestas="
				+ propuestas + ", especial=" + especial + ", visitas_idvisita=" + visitas_idvisita + "]";
	}

	
	
	
	


	
	
	

}
