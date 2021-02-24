package com.micro.articulo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.micro.articulo.entities.Articulo;

public interface IArticuloDAO extends CrudRepository<Articulo, Integer>{
	@Query("SELECT u FROM Articulo u WHERE u.nombre=:nombre")
	public Articulo findByName(@Param("nombre") String name);

}
