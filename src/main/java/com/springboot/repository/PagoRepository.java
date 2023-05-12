package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Pago;
@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer>{

}
