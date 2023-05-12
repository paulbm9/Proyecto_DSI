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
@Table(name = "matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private int idmatricula;
	@Column
	private String fechamatricula;
	
	@Column
	private String cronograma;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpago")
	private Pago pago;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idsecretaria")
	private Secretaria secretaria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idsalon")
	private Salon salon;

	public int getIdmatricula() {
		return idmatricula;
	}

	public void setIdmatricula(int idmatricula) {
		this.idmatricula = idmatricula;
	}

	public String getFechamatricula() {
		return fechamatricula;
	}

	public void setFechamatricula(String fechamatricula) {
		this.fechamatricula = fechamatricula;
	}

	public String getCronograma() {
		return cronograma;
	}

	public void setCronograma(String cronograma) {
		this.cronograma = cronograma;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}
	
	
	
	
}
