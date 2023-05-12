package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.dao.SecretariaDaoImp;
import com.springboot.model.Secretaria;

@Controller
public class ControllerSecretaria {

	@Autowired
	private SecretariaDaoImp dao;
	
	@GetMapping("/listar")
	public String listado(Model modelo) {
		List<Secretaria>lista = dao.findAll();
		modelo.addAttribute("listasecretaria", lista);
		return "listar";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		Secretaria sec = new Secretaria();
		modelo.addAttribute("secretaria",sec);
		return "guardar";
	}
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("secretaria") Secretaria sec) {
		dao.save(sec);
		return "redirect:/listar";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") int id) {
		dao.delete(id);
		return "redirect:/listar";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") int id, Model modelo) {
		Secretaria sec = dao.findById(id);
		modelo.addAttribute("secretaria",sec);
		return "editar";
	}
	@PostMapping("/actualizar")
	public String actualizar(@ModelAttribute ("secretaria") Secretaria sec) {
		dao.update(sec);
		return "redirect:/listar";
		
	}
}
