package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.dao.DocenteDaoImp;
import com.springboot.model.Docente;

@Controller
public class ControllerDocente {

	@Autowired
	private DocenteDaoImp dao;
	
	@GetMapping("/listardoc")
	public String listardoc(Model modelo) {
		List<Docente>lista=dao.findAll();
		modelo.addAttribute("listadocente",lista);
		return "listardocente";
	}
	
	@GetMapping("/nuevodoc")
	public String nuevodoc(Model modelo) {
		Docente doc=new Docente();
		modelo.addAttribute("docente",doc);
		return "guardardocente";
	}
	
	@PostMapping("/guardardoc")
	public String guardardoc(@ModelAttribute("docente") Docente doc) {
		dao.guardar(doc);
		return "redirect:/listardoc";
	}
	
	@GetMapping("/editardoc/{id}")
	public String editardoc(@PathVariable("id") int id, Model modelo) {
		Docente doc=dao.findById(id);
		modelo.addAttribute("docente",doc);
		return "editardocente";
	}
	
	@PostMapping("/actualizardoc")
	public String actualizardoc(@ModelAttribute("docente") Docente doc) {
		dao.actualizar(doc);
		return "redirect:/listardoc";
	}
	
	@GetMapping("/borrardoc/{id}")
	public String borrardoc(@PathVariable("id") int id) {
		dao.borrar(id);
		return "redirect:/listardoc";
	}
}
