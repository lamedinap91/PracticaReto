package com.practica.rest.service;

import java.util.List;
import java.util.Optional;

import com.practica.rest.model.Empleado;



public interface EmpleadoService {
	
	List<Empleado> listar();
	Empleado crear(Empleado emp);
	Empleado modificar(Empleado emp);
	void eliminar(Empleado emp);
	Optional <Empleado> listarPorId(Integer emp);

}
