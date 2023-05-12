package com.springboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Estudiante;
import com.springboot.repository.EstudianteRepository;
import com.springboot.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	@Autowired
	private EstudianteRepository repository;
	
	@Override
	public List<Estudiante> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Estudiante estu) {
		repository.save(estu);
		
	}

	@Override
	public void borrar(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Estudiante> buscarId(int id) {
		return repository.findById(id);
	}

}
