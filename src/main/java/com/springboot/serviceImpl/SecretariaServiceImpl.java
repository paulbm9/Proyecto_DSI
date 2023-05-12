package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Secretaria;
import com.springboot.repository.SecretariaRepository;
import com.springboot.service.SecretariaService;
@Service
public class SecretariaServiceImpl implements SecretariaService{
	@Autowired
	private SecretariaRepository repository;
	@Override
	public List<Secretaria> listarTodos() {
		return repository.findAll();
	}

}
