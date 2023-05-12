package com.springboot.dao;

import java.util.List;

import com.springboot.model.Docente;

public interface IDocenteDao {

	public List<Docente>findAll();
	
	public int guardar(Docente doc);
	
	public Docente findById(long id);
	
	public int borrar(long id);
	
	public int actualizar(Docente doc);
}
