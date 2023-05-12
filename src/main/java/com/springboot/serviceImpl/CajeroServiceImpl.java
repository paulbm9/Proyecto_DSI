package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Cajero;
import com.springboot.repository.CajeroRepository;
import com.springboot.service.CajeroService;
@Service
public class CajeroServiceImpl implements CajeroService{
	@Autowired
	private CajeroRepository repository;
	
	@Override
	public List<Cajero> listarTodos() {
		return repository.findAll();
	}

}
