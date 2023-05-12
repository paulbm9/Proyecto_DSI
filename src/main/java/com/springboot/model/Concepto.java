package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "concepto")
public class Concepto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idconcepto;
	
	@Column
	private String nomconcepto;

	public int getIdconcepto() {
		return idconcepto;
	}

	public void setIdconcepto(int idconcepto) {
		this.idconcepto = idconcepto;
	}

	public String getNomconcepto() {
		return nomconcepto;
	}

	public void setNomconcepto(String nomconcepto) {
		this.nomconcepto = nomconcepto;
	}
	
	
}
