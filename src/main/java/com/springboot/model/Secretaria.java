package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "secretaria")
public class Secretaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idsecretaria;
	
	@Column
	private String nombre;
	@Column
	private String apePat;
	@Column
	private String apeMat;
	@Column
	private String fechadeNac;
	@Column
	private String telefono;
	@Column
	private String correo;
	@Column
	private String fechadeIniContrat;
	@Column
	private String fechadeFinContrat;
	@Column
	private double sueldo;
	@Column
	private String direccion;
	@Column
	private String distrito;
	@Column
	private String estado;
	
	
	
	public Secretaria() {
		super();
		
	}



	public Secretaria(int idsecretaria, String nombre, String apePat, String apeMat, String fechadeNac, String telefono,
			String correo, String fechadeInitContrat, String fechadeFinContrat, double sueldo, String direccion,
			String distrito, String estado) {
		super();
		this.idsecretaria = idsecretaria;
		this.nombre = nombre;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.fechadeNac = fechadeNac;
		this.telefono = telefono;
		this.correo = correo;
		this.fechadeIniContrat = fechadeInitContrat;
		this.fechadeFinContrat = fechadeFinContrat;
		this.sueldo = sueldo;
		this.direccion = direccion;
		this.distrito = distrito;
		this.estado = estado;
	}



	public int getIdsecretaria() {
		return idsecretaria;
	}



	public void setIdSecretaria(int idsecretaria) {
		this.idsecretaria = idsecretaria;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApePat() {
		return apePat;
	}



	public void setApePat(String apePat) {
		this.apePat = apePat;
	}



	public String getApeMat() {
		return apeMat;
	}



	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}



	public String getFechadeNac() {
		return fechadeNac;
	}



	public void setFechadeNac(String fechadeNac) {
		this.fechadeNac = fechadeNac;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getFechadeIniContrat() {
		return fechadeIniContrat;
	}



	public void setFechadeIniContrat(String fechadeIniContrat) {
		this.fechadeIniContrat = fechadeIniContrat;
	}



	public String getFechadeFinContrat() {
		return fechadeFinContrat;
	}



	public void setFechadeFinContrat(String fechadeFinContrat) {
		this.fechadeFinContrat = fechadeFinContrat;
	}



	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getDistrito() {
		return distrito;
	}



	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
