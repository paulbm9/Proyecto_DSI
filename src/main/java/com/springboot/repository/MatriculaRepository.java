package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Matricula;
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer>{

}
