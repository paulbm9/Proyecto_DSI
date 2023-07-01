package com.springboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Pago;
import com.springboot.model.Pension;
import com.springboot.repository.PagoRepository;
import com.springboot.repository.PensionRepository;
import com.springboot.service.PagoService;
import com.springboot.service.PensionService;


@Service
public class PensionServiceImpl implements PensionService {
	
	@Autowired
	private PensionRepository repository;

	@Override
	public List<Pension> buscarPorIdMatricula(int idmatricula) {
	    return repository.findAllByMatriculaIdmatricula(idmatricula);
	}
	


}
