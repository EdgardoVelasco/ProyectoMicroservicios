package com.micro.articulo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.micro.articulo.dao.IArticuloDAO;
import com.micro.articulo.entities.Articulo;
@Service
public class ArticuloServiceImpl implements IArticuloService {
	@Autowired
	private IArticuloDAO dao;

	@Override
	public List<Articulo> getAll() {
	
		return (List<Articulo>)dao.findAll();
		
	}

	@Override
	public Articulo findByName(String name) {
		
		return dao.findByName(name);
	}

	@Override
	public Articulo findById(int id) {
		
		return dao.findById(id).orElse(null);
	}

	@Override
	public Articulo save(Articulo art) {
		
		return dao.save(art);
	}

	@Override
	public boolean deleteById(int id) {
		try {
		dao.deleteById(id);
		return true;
		}catch(EmptyResultDataAccessException ex) {
			return false;
		}
	}
}
