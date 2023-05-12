package com.springboot.service;

import java.util.List;

import com.springboot.model.Salon;

public interface SalonService {

	public List<Salon>listarTodos();
	public void guardar(Salon sal);
	public Salon findById(long id);
	public void update(Salon sal);
}
