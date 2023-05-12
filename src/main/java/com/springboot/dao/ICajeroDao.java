package com.springboot.dao;

import java.util.List;

import com.springboot.model.Cajero;

public interface ICajeroDao {
	
	//listar todos los cajeros
	public List<Cajero>finAll();
	
	//guardar registros
	public int save(Cajero alu);
	
	//buscar registros
	public Cajero findById(long id);
	
	//borrar registros
	public int delete(long id);
	
	//actualizar registro
	public int update(Cajero alu);
	
}
