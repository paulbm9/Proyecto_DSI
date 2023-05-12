package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.dao.CajeroDaoImp;
import com.springboot.model.Cajero;

@Controller
public class ControllerCajero {
	
	@Autowired
	private CajeroDaoImp dao;
	
	@GetMapping("/listarCajero")
	public String listarCajero(Model modelo) {
		List<Cajero>lista = dao.finAll();
		modelo.addAttribute("listacajeros",lista);
		return "listadocajero";
	}
	
	@GetMapping("/nuevoCajero")
	public String nuevoCajero(Model modelo) {
		Cajero caj = new Cajero();
		modelo.addAttribute("cajero",caj);
		return "guardarcajero";
	}
	
	@PostMapping("/guardarCajero")
	public String guardarCajero(@ModelAttribute("cajero") Cajero caj) {
		dao.save(caj);
		return "redirect:/listarCajero";
	}
	
	@GetMapping("/borrarCajero/{id}")
	public String borrarCajero(@PathVariable("id") int id) {
		dao.delete(id);
		return "redirect:/listarCajero";
	}
	
	@GetMapping("/editarCajero/{id}")
	public String editarCajero(@PathVariable("id") int id, Model modelo) {
		Cajero caj = dao.findById(id);
		modelo.addAttribute("cajero", caj);
		return "editarcajero";
	}
	
	@PostMapping("/actualizarCajero")
	public String actualizarCajero(@ModelAttribute("cajero") Cajero caj) {
		dao.update(caj);
		return "redirect:/listarCajero";
	}
}
