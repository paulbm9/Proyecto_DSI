package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Cajero;

@Repository
public interface CajeroRepository extends JpaRepository<Cajero, Integer>{

}
