package com.m5d5.beans;

import java.util.List;

public class Actividades {
	
	private List<Asesoria> asesorias;
	private List<Visita> visitas;
	private List<Checklist> checklist; 
	private List<Capacitacion> capacitaciones; 
	
	public Actividades() {
		
	}
	
	public Actividades(List<Asesoria> asesorias, List<Visita> visitas, List<Checklist> checklist,
			List<Capacitacion> capacitaciones) {
		super();
		this.asesorias = asesorias;
		this.visitas = visitas;
		this.checklist = checklist;
		this.capacitaciones = capacitaciones;
	}

	public List<Checklist> getchecklist() {
		return checklist;
	}

	public void setchecklist(List<Checklist> checklist) {
		this.checklist = checklist;
	}

	public List<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(List<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
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
