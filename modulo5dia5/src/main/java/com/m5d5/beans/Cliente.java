package com.m5d5.beans;

public class Cliente {

	private int id;
	private String nombre;
	private int telefono;
	private String correoelectronico;
	private String rubro;
	private String direccion;
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nombre, int telefono, String correoelectronico, String rubro,
			String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.rubro = rubro;
		this.direccion = direccion;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	
	public String getRubro() {
		return rubro;
	}
	
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Cliente [idcliente=" + id + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", correoelectronico=" + correoelectronico + ", rubro=" + rubro + ", direccion=" + direccion + "]";
	}
	
	
	
}
