package com.springboot.controller;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.Apoderado;
import com.springboot.model.Cajero;
import com.springboot.model.Concepto;
import com.springboot.model.Estudiante;
import com.springboot.model.Pago;
import com.springboot.service.ApoderadoService;
import com.springboot.service.CajeroService;
import com.springboot.service.ConceptoService;
import com.springboot.service.EstudianteService;
import com.springboot.service.PagoService;

@Controller
public class ControllerPago {
	@Autowired
	private ConceptoService serviceConcepto;
	
	@Autowired
	private PagoService servicePago;
	
	@Autowired
	private CajeroService serviceCajero;
	
	@Autowired
	private ApoderadoService serviceApoderado;
	
	@Autowired
	private EstudianteService serviceEstudiante;
	
	@GetMapping("/listadoPago")
	public String listadoP(Model modelo) {
		List<Pago>lista = servicePago.listarTodos();
		modelo.addAttribute("listapagos",lista);
		return "listadopago";
	}
	
	@GetMapping("/registroPago")
	public String registroPago(Model modelo) {
		List<Concepto>lista=serviceConcepto.listarTodos();
		List<Cajero>listaCaj=serviceCajero.listarTodos();
		List<Apoderado>listaApo=serviceApoderado.listartodos();
		List<Estudiante>listaEst=serviceEstudiante.listarTodos();
		modelo.addAttribute("pago", new Pago());
		modelo.addAttribute("listaConcepto", lista);
		modelo.addAttribute("listaCajero", listaCaj);
		modelo.addAttribute("listaApoderado", listaApo);
		modelo.addAttribute("listaEstudiante", listaEst);
		return "registropago";
	}
	
	@PostMapping("/guardarPago")
	public String guardarPago(@ModelAttribute Pago pago) {
		servicePago.guardar(pago);
		return "redirect:/listadoPago";
	}
	
	@GetMapping("/editarPago/{id}")
	public String editarPago(@PathVariable int id, Model modelo) {
		Optional<Pago>lista=servicePago.buscarId(id);
		List<Concepto>listaCon=serviceConcepto.listarTodos();
		List<Cajero>listaCaj=serviceCajero.listarTodos();
		List<Apoderado>listaApo=serviceApoderado.listartodos();
		List<Estudiante>listaEst=serviceEstudiante.listarTodos();
		modelo.addAttribute("pago", lista);
		modelo.addAttribute("listaConcepto", listaCon);
		modelo.addAttribute("listaCajero", listaCaj);
		modelo.addAttribute("listaApoderado", listaApo);
		modelo.addAttribute("listaEstudiante", listaEst);
		return "registropago";
	}
	
	@GetMapping("/borrarPago/{id}")
	public String borrarPago(@PathVariable int id) {
		servicePago.borrar(id);
		return "redirect:/listadoPago";
	}
	
	@RequestMapping("/imprimirPago/{id}")
	public String imprimirPago(@PathVariable("id") Long id, Map<String,Object> model, Model model2) {
		Optional<Pago>pa=null;
		List<Pago>pago=new ArrayList<>();
		if(id>0) {
			pa=servicePago.buscarId(id);
			for(Pago p:servicePago.listarTodos()) {
				if(p.getIdpago()==id) {
					pago.add(p);
				}
			}
		}
		model.put("pago", pa);
		model2.addAttribute("listaPago", pago);
		model2.addAttribute("java8Instant", Instant.now());
		return "imprimirpago";
	}
}
