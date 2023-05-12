package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.model.Docente;
import com.springboot.model.Salon;
import com.springboot.service.DocenteService;
import com.springboot.service.SalonService;

@Controller
public class ControllerSalon {

	@Autowired
	private DocenteService servicedocente;
	
	@Autowired
	private SalonService service;
	
	@GetMapping("/listarSal")
	public String listarSal(Model modelo) {
		List<Salon>lista=service.listarTodos();
		modelo.addAttribute("lista_salon",lista);
		return "listadosalon";
	}
	
	@GetMapping("/nuevoSal")
	public String nuevoSal (Model modelo) {
		modelo.addAttribute("salon", new Salon());
		List<Docente>listaDoc=servicedocente.listarTodos();
		modelo.addAttribute("lista_docente",listaDoc);
		return "guardarsalon";
	}
	
	@PostMapping("/guardarSal")
	public String guardar(@ModelAttribute Salon salon) {
		service.guardar(salon);
		return "redirect:/listarSal";
	}
	
	@GetMapping("/editarSal/{id}")
	public String editar(@PathVariable("id") int id, Model modelo) {
		Salon sal = service.findById(id);
		List<Docente>listaDoc=servicedocente.listarTodos();
		modelo.addAttribute("salon",sal);
		modelo.addAttribute("lista_docente",listaDoc);
		return "editarsalon";
	}
	
	@PostMapping("/actualizarSal")
	public String actualizar(@ModelAttribute ("salon") Salon sal) {
		service.update(sal);
		return "redirect:/listarSal";
		
	}
}
