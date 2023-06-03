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
import com.springboot.model.Estudiante;
import com.springboot.model.Matricula;
import com.springboot.service.ApoderadoService;
import com.springboot.service.EstudianteService;

@Controller
public class ControllerEstudiante {

	@Autowired
	private ApoderadoService serviceapoderado;
	
	@Autowired
	private EstudianteService serviceestudiante;
	
	@GetMapping("/listarestu")
	public String index(Model modelo) {
		List<Estudiante>lista =serviceestudiante.listarTodos();
		modelo.addAttribute("listaEstudiante", lista);
		return "listadoestudiante";
		
	}
	
	@GetMapping("/estudiante")
	public String index2(Model model) {
	    List<Estudiante> listaEstudiante = serviceestudiante.listarTodos();
	    model.addAttribute("listaEstudiante", listaEstudiante);
	    return "principal";
	}
	
	
	
	
	@GetMapping("/nuevoe")
	public String nuevoe(Model modelo) {
		
		List<Apoderado>lista=serviceapoderado.listartodos();
		modelo.addAttribute("estudiante",new Estudiante());
		modelo.addAttribute("listarApoderado", lista);
		return "gestionestudiante";
	}
	
	@PostMapping("/guardare")
	public String guardare(@ModelAttribute Estudiante estudiante) {
		serviceestudiante.guardar(estudiante);
		return "redirect:/listarestu";
	}
	
	@GetMapping("/borrare/{id}")
	public String borrare (@PathVariable int id) {
		serviceestudiante.borrar(id);
		return "redirect:/listarestu";
	}
	@GetMapping("/editare/{id}")
	public String editare(@PathVariable int id,Model modelo) {
		Optional<Estudiante>listae = serviceestudiante.buscarId(id);
		List<Apoderado>lista=serviceapoderado.listartodos();
		modelo.addAttribute("estudiante",new Estudiante());
		modelo.addAttribute("listarApoderado", lista);
		modelo.addAttribute("estudiante", listae);
		return "gestionestudiante";
	}
	
}
