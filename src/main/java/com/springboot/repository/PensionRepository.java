package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.springboot.model.Pension;

@Repository
public interface PensionRepository  extends JpaRepository<Pension, Integer>{ 

	
	   List<Pension> findAllByMatriculaIdmatricula(int idmatricula);
	
}
