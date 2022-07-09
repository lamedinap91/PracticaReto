package com.practica.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.rest.model.Empleado;
import com.practica.rest.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private EmpleadoService service;
	
	@GetMapping
	public List<Empleado> listar() {
		return service.listar();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Empleado> listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
		
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Empleado registrar (@RequestBody Empleado emp) {
		
		return service.crear(emp);
	}
	
	@PutMapping(consumes = "application/json", produces = "application/json")
	public Empleado modificar (@RequestBody Empleado emp) {
		
		return service.modificar(emp);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		Empleado emp = new Empleado();
		emp.setId(id);
		service.eliminar(emp);
		
	}

}
