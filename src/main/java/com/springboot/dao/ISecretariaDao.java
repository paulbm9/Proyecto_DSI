package com.springboot.dao;

import java.util.List;

import com.springboot.model.Secretaria;

public interface ISecretariaDao {

	public List<Secretaria>findAll();
	public int save(Secretaria sec);
	public Secretaria findById(long id);
	public int delete(long id);
	public int update(Secretaria sec);
}
