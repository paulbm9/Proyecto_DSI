package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Docente;
import com.springboot.repository.DocenteRepository;
import com.springboot.service.DocenteService;
@Service
public class DocenteServiceImpl implements DocenteService{

	@Autowired
	private DocenteRepository repository;
	@Override
	public List<Docente> listarTodos() {
		return repository.findAll();
	}

}
