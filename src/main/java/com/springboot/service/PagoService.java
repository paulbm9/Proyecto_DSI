package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.Pago;

public interface PagoService {

	public List<Pago>listarTodos();
	public void guardar(Pago pago);
	public Optional<Pago>buscarId(long id);
	public void borrar(int id);
}
