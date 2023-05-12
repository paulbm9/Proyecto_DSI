package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.model.Cajero;

@Repository
public class CajeroDaoImp implements ICajeroDao{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<Cajero> finAll() {
		String sql = "select * from cajero";
		List<Cajero>lista = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Cajero.class));
		return lista;
	}

	@Override
	public int save(Cajero caj) {
		String sql = "insert into cajero(nombre,apepat,apemat,fechadenac,telefono,correo,fechadeinicontrat,fechadefincontrat,sueldo,estado,direccion,distrito,observaciones)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return jdbc.update(sql, caj.getNombre(),caj.getApepat(),caj.getApemat(),caj.getFechadenac(),caj.getTelefono(),caj.getCorreo(),caj.getFechadeinicontrat(),caj.getFechadefincontrat(),caj.getSueldo(),caj.getEstado(),caj.getDireccion(),caj.getDistrito(),caj.getObservaciones());
	}

	@Override
	public Cajero findById(long id) {
		String sql = "select * from cajero where idcajero=?";
		Cajero caj = jdbc.queryForObject(sql, new Object[] {id},BeanPropertyRowMapper.newInstance(Cajero.class));
		return caj;
	}

	@Override
	public int delete(long id) {
		String sql = "delete from cajero where idcajero=?";
		return jdbc.update(sql, id);
	}

	@Override
	public int update(Cajero caj) {
		String sql = "update cajero set nombre=?,apepat=?,apemat=?,fechadenac=?,telefono=?,correo=?,fechadeinicontrat=?,fechadefincontrat=?,sueldo=?,estado=?,direccion=?,distrito=?,observaciones=? where idcajero=?";
		return jdbc.update(sql,caj.getNombre(),caj.getApepat(),caj.getApemat(),caj.getFechadenac(),caj.getTelefono(),caj.getCorreo(),caj.getFechadeinicontrat(),caj.getFechadefincontrat(),caj.getSueldo(),caj.getEstado(),caj.getDireccion(),caj.getDistrito(),caj.getObservaciones(),caj.getIdcajero());
	}

}
