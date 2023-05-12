package com.springboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Apoderado;
import com.springboot.repository.ApoderadoRepository;
import com.springboot.service.ApoderadoService;

@Service
public class ApoderadoServiceImpl implements ApoderadoService{
	@Autowired
	private ApoderadoRepository repository;
	
	@Override
	public List<Apoderado> listartodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Apoderado apo) {
		repository.save(apo);
		
	}

	@Override
	public void borrar(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Apoderado> buscarId(int id) {
		return repository.findById(id);
	}

}
