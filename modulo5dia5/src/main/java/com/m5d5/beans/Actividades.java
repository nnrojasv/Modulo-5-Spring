package com.m5d5.beans;

import java.util.List;

public class Actividades {
	
	private List<Asesoria> asesorias;
	private List<Visita> visitas;
	
	public Actividades() {
		
	}
	public Actividades(List<Asesoria> asesorias, List<Visita> visitas) {
		
		this.asesorias = asesorias;
		this.visitas = visitas;
	}
	public List<Asesoria> getAsesorias() {
		return asesorias;
	}
	public void setAsesorias(List<Asesoria> asesorias) {
		this.asesorias = asesorias;
	}
	public List<Visita> getVisitas() {
		return visitas;
	}
	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}
	
	

}
