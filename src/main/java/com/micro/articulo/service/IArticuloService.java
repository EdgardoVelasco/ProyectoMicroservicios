package com.micro.articulo.service;

import java.util.List;

import com.micro.articulo.entities.Articulo;

public interface IArticuloService {
	public List<Articulo> getAll();
	public Articulo findByName(String name);
	public Articulo findById(int id);
	public Articulo save(Articulo art);
	public boolean deleteById(int id);

}
