package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Secretaria;

@Repository
public interface SecretariaRepository extends JpaRepository<Secretaria, Integer>{

}
