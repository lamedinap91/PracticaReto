package com.practica.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.practica.rest.dao.EmpleadoDao;
import com.practica.rest.model.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoDao empleadodao; 
	

	
	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return empleadodao.findAll();
	}

	@Override
	public Empleado crear(Empleado emp) {
		// TODO Auto-generated method stub
		return empleadodao.save(emp);
	}

	@Override
	public Empleado modificar(Empleado emp) {
		// TODO Auto-generated method stub
		return empleadodao.save(emp);
	}

	@Override
	public void eliminar(Empleado emp) {
		// TODO Auto-generated method stub
		empleadodao.delete(emp);
	}

	@Override
	public Optional<Empleado> listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return empleadodao.findById(id);
	
	}
	
}
