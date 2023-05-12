package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.model.Secretaria;

@Repository
public class SecretariaDaoImp implements ISecretariaDao{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<Secretaria> findAll() {
		String sql = "select * from secretaria";
		List<Secretaria>lista = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Secretaria.class));
		return lista;
	}

	@Override
	public int save(Secretaria sec) {
 String sql= "insert into secretaria(nombre,apePat,apeMat,fechadeNac,telefono,correo,fechadeIniContrat,fechadeFinContrat,sueldo,direccion,distrito,estado)values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		return jdbc.update(sql,sec.getNombre(),sec.getApePat(),sec.getApeMat(),sec.getFechadeNac(),sec.getTelefono(),sec.getCorreo(),sec.getFechadeIniContrat(),sec.getFechadeFinContrat(),sec.getSueldo(),sec.getDireccion(),sec.getDistrito(),sec.getEstado());
		
	}

	@Override
	public Secretaria findById(long id) {
		String sql = "select * from secretaria where idsecretaria=?";
		Secretaria sec = jdbc.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Secretaria.class));
		
		return sec;
	}

	@Override
	public int delete(long id) {
         String sql = "delete from secretaria where idsecretaria=?";
		
		 return jdbc.update(sql,id);
	}

	@Override
	public int update(Secretaria sec) {
     String sql= "update secretaria set nombre=?, apePat=?, apeMat=?, fechadeNac=?, telefono=?, correo=?, fechadeIniContrat=?, fechadeFinContrat=?, sueldo=?, direccion=?, distrito=?, estado=? where idsecretaria=?";
		
		return jdbc.update(sql,sec.getNombre(),sec.getApePat(),sec.getApeMat(),sec.getFechadeNac(),sec.getTelefono(),sec.getCorreo(),sec.getFechadeIniContrat(),sec.getFechadeFinContrat(),sec.getSueldo(),sec.getDireccion(),sec.getDistrito(),sec.getEstado(),sec.getIdsecretaria());
	}

	

}
