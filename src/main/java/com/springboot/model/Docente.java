package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "docente")
public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int iddocente;
	@Column
	private String nombre;
	@Column
	private String apepat;
	@Column
	private String apemat;
	@Column
	private String fechadenac;
	@Column
	private String telefono;
	@Column
	private String correo;
	@Column
	private String fechadeinicontrat;
	@Column
	private String fechadefincontrat;
	@Column
	private double sueldo;
	@Column
	private String direccion;
	@Column
	private String distrito;
	@Column
	private String estado;
	
	public Docente() {
	
	}
	
	
	public Docente(int iddocente, String nombre, String apepat, String apemat, String fechadenac, String telefono,
			String correo, String fechadeinicontrat, String fechadefincontrat, double sueldo, String direccion,
			String distrito, String estado) {
		super();
		this.iddocente = iddocente;
		this.nombre = nombre;
		this.apepat = apepat;
		this.apemat = apemat;
		this.fechadenac = fechadenac;
		this.telefono = telefono;
		this.correo = correo;
		this.fechadeinicontrat = fechadeinicontrat;
		this.fechadefincontrat = fechadefincontrat;
		this.sueldo = sueldo;
		this.direccion = direccion;
		this.distrito = distrito;
		this.estado = estado;
	}


	public int getIddocente() {
		return iddocente;
	}
	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApepat() {
		return apepat;
	}
	public void setApepat(String apepat) {
		this.apepat = apepat;
	}
	public String getApemat() {
		return apemat;
	}
	public void setApemat(String apemat) {
		this.apemat = apemat;
	}
	public String getFechadenac() {
		return fechadenac;
	}
	public void setFechadenac(String fechadenac) {
		this.fechadenac = fechadenac;
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
	public String getFechadeinicontrat() {
		return fechadeinicontrat;
	}
	public void setFechadeinicontrat(String fechadeinicontrat) {
		this.fechadeinicontrat = fechadeinicontrat;
	}
	public String getFechadefincontrat() {
		return fechadefincontrat;
	}
	public void setFechadefincontrat(String fechadefincontrat) {
		this.fechadefincontrat = fechadefincontrat;
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
