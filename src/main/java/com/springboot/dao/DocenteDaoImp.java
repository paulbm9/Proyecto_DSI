package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.model.Docente;

@Repository
public class DocenteDaoImp implements IDocenteDao{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<Docente> findAll() {
		String sql="select * from docente";
		List<Docente>lista=jdbc.query(sql, BeanPropertyRowMapper.newInstance(Docente.class));
		return lista;
	}

	@Override
	public int guardar(Docente doc) {
		String sql="insert into docente(nombre,apepat,apemat,fechadenac,telefono,correo,fechadeinicontrat,"
				+ "fechadefincontrat,sueldo,direccion,distrito,estado) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		return jdbc.update(sql, doc.getNombre(),doc.getApepat(),doc.getApemat(),doc.getFechadenac(),doc.getTelefono(),
				doc.getCorreo(),doc.getFechadeinicontrat(),doc.getFechadefincontrat(),doc.getSueldo(),doc.getDireccion(),
				doc.getDistrito(),doc.getEstado());
	}

	@Override
	public Docente findById(long id) {
		String sql="select * from docente where iddocente=?";
		Docente doc=jdbc.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Docente.class));
		return doc;
	}

	@Override
	public int borrar(long id) {
		String sql="delete from docente where iddocente=?";
		return jdbc.update(sql, id);
	}

	@Override
	public int actualizar(Docente doc) {
		String sql="update docente set nombre=?,apepat=?,apemat=?,fechadenac=?,telefono=?,correo=?,fechadeinicontrat=?,"
				+ "fechadefincontrat=?,sueldo=?,direccion=?,distrito=?,estado=? where iddocente=?";
		return jdbc.update(sql, doc.getNombre(),doc.getApepat(),doc.getApemat(),doc.getFechadenac(),doc.getTelefono(),
				doc.getCorreo(),doc.getFechadeinicontrat(),doc.getFechadefincontrat(),doc.getSueldo(),doc.getDireccion(),
				doc.getDistrito(),doc.getEstado(), doc.getIddocente());
	}

	
}
