package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.Estudiante;

public interface EstudianteService {
	public List<Estudiante>listarTodos();
	public void guardar(Estudiante estu);
	public void borrar(int id);
	public Optional<Estudiante>buscarId(int id);

}
