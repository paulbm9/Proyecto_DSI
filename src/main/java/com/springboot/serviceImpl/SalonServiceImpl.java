package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.springboot.model.Salon;
import com.springboot.repository.SalonRepository;
import com.springboot.service.SalonService;

@Service
public class SalonServiceImpl implements SalonService{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Autowired
	private SalonRepository repository;
	
	@Override
	public List<Salon> listarTodos() {
		return repository.listaProcedure();
	}

	@Override
	public void guardar(Salon sal) {
		repository.guardarProcedure(sal.getEstado(), sal.getSeccion(), sal.getAnio(), sal.getGrado(), sal.getDocente().getIddocente());
		
	}

	@Override
	public Salon findById(long id) {
		String sql = "select * from salon where idsalon=?";
		Salon sal= jdbc.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Salon.class));
		return sal;
	}

	@Override
	public void update(Salon sal) {
		repository.actualizarProcedure(sal.getIdsalon(), sal.getEstado(), sal.getSeccion(), sal.getAnio(), sal.getGrado(), sal.getDocente().getIddocente());
		
	}

}
