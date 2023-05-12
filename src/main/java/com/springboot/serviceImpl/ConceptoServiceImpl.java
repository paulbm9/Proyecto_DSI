package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Concepto;
import com.springboot.repository.ConceptoRepository;
import com.springboot.service.ConceptoService;

@Service
public class ConceptoServiceImpl implements ConceptoService{

	@Autowired
	private ConceptoRepository repository;
	
	@Override
	public List<Concepto> listarTodos() {
		return repository.findAll();
	}

}
