package com.springboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.model.Salon;
@Repository
public interface SalonRepository extends JpaRepository<Salon, Integer>{

	@Query(value = "{call usp_listar_salon()}", nativeQuery = true)
	public List<Salon>listaProcedure();
	
	@Transactional
	@Modifying
	@Query(value = "{call usp_insert_salon(:s_estado, :s_seccion, :s_anio, :s_grado, :s_iddoc)}", nativeQuery = true)
	public void guardarProcedure(
			@Param("s_estado")String s_estado,
			@Param("s_seccion")String s_seccion,
			@Param("s_anio")String s_anio,
			@Param("s_grado")String s_grado,
			@Param("s_iddoc")int s_iddoc
			);
	
	@Transactional
	@Modifying
	@Query(value = "{call usp_update_salon(:s_idsalon, :s_estado, :s_seccion, :s_anio, :s_grado, :s_iddocente)}", nativeQuery = true)
	public void actualizarProcedure(
			@Param("s_idsalon") int s_idsalon,
			@Param("s_estado") String s_estado,
			@Param("s_seccion") String s_seccion,
			@Param("s_anio") String s_anio,
			@Param("s_grado") String s_grado,
			@Param("s_iddocente") int s_iddocente
			);
	
}
