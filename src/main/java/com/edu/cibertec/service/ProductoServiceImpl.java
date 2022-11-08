package com.edu.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.edu.cibertec.modelo.Producto;
import com.edu.cibertec.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	
	@Override
	public List<Producto> obtenerTodos() {
		// TODO Auto-generated method stub
		return repository.findAll() ;
	}


	@Override
	public void guardar(Producto o) {
		// TODO Auto-generated method stub
		repository.save(o);
	}


	@Override
	public Producto getProductoById(int id) {
		// TODO Auto-generated method stub
		
		Optional<Producto> optional =repository.findById(id);
		Producto o = null;
		
		if(optional.isPresent())
		{
			o=optional.get();
		}
			
		return o;
	}


	@Override
	public void eliminarProductoById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	
	
}
