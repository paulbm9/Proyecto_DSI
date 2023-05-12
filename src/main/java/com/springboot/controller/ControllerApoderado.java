package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.model.Apoderado;
import com.springboot.service.ApoderadoService;

@Controller
public class ControllerApoderado {
	@Autowired
	private ApoderadoService service;
	
	@GetMapping("/listarApo")
	public String listar(Model modelo) {
		List<Apoderado>lista = service.listartodos();
		modelo.addAttribute("listaApoderado",lista);
		return "listadoapoderado";
	}
	
	@GetMapping("/nuevoApo")
	public String nuevoApoderado(Model modelo) {
		modelo.addAttribute("apoderado", new Apoderado());
		return "gestionapoderado";
	}
	
	@PostMapping("/guardarApo")
	public String guardarApo(@ModelAttribute Apoderado apoderado) {
		service.guardar(apoderado);
		return "redirect:/listarApo";
	}
	
	@GetMapping("/borrarApo/{id}")
	public String borrarApo(@PathVariable int id) {
		service.borrar(id);
		return "redirect:/listarApo";
	}
	
	@GetMapping("/editarApo/{id}")
	public String editarApo(@PathVariable int id, Model modelo) {
		Optional<Apoderado>lista =service.buscarId(id);
		modelo.addAttribute("apoderado",lista);
		return "gestionapoderado";
	}
}
