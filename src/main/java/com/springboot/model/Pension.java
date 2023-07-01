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
@Table(name = "pension")
public class Pension {

	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "idPension")
	    public int idPension;

	   @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "idmatricula")
	    public Matricula matricula;
	    

	
	@Column
	public String fechaVencimiento;
	
	@Column
	public String fechaOperacion;
	
	@Column
	public double monto;
	
	@Column
	public String estado;
	
	
	
	

	

}
