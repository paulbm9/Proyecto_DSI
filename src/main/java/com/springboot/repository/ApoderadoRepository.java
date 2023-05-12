package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Apoderado;
@Repository
public interface ApoderadoRepository extends JpaRepository<Apoderado, Integer>{

}
