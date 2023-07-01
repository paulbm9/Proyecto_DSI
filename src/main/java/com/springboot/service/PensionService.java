package com.springboot.service;

import java.util.List;

import com.springboot.model.Pension;

public interface PensionService {
	 public List<Pension> buscarPorIdMatricula(int idmatricula);
}
