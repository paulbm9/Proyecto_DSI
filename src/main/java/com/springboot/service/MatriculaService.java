package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.Matricula;

public interface MatriculaService {
	public List<Matricula>listarTodos();
	public void guardar(Matricula matricula);
	public Optional<Matricula>encontrarId(long id);
}
