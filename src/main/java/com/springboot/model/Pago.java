package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idpago;
	
	@Column
	private String fechaoperacion;
	
	@Column
	private double monto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcajero")
	private Cajero cajero;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idapoderado")
	private Apoderado apoderado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idestudiante")
	private Estudiante estudiante;
	
	@ManyToOne(fetch =FetchType.LAZY )
	@JoinColumn(name = "idconcepto")
	private Concepto concepto;
	
	

	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	public String getFechaoperacion() {
		return fechaoperacion;
	}

	public void setFechaoperacion(String fechaoperacion) {
		this.fechaoperacion = fechaoperacion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Apoderado getApoderado() {
		return apoderado;
	}

	public void setApoderado(Apoderado apoderado) {
		this.apoderado = apoderado;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Concepto getConcepto() {
		return concepto;
	}

	public void setConcepto(Concepto concepto) {
		this.concepto = concepto;
	}
	
	
}
