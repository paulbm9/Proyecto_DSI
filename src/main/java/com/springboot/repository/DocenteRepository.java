package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer>{

}
