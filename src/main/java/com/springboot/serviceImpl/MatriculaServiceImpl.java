package com.springboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Matricula;
import com.springboot.repository.MatriculaRepository;
import com.springboot.service.MatriculaService;
@Service
public class MatriculaServiceImpl implements MatriculaService{
	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public List<Matricula> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Matricula matricula) {
		repository.save(matricula);
	}

	@Override
	public Optional<Matricula> encontrarId(long id) {
		return repository.findById((int) id);
	}

}
