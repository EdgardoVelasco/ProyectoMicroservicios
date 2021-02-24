package com.micro.articulo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.articulo.entities.Articulo;
import com.micro.articulo.service.IArticuloService;

@RestController
public class ArticuloController {
  @Autowired
  private IArticuloService servicio;
  
  @GetMapping("/articulo/{name}")
  public Articulo findByName(@PathVariable String name) {
	  return servicio.findByName(name);
  }
  
  @GetMapping("/articulos")
  public List<Articulo> getAll(){
	return servicio.getAll(); 
  }
  
  @PostMapping("/articulo-n")
  public Articulo save(@RequestBody Articulo art) {
	  return servicio.save(art);
  }
  
  @DeleteMapping("/articulo-d/{id}")
  public boolean delete(@PathVariable int id) {
	  return servicio.deleteById(id);
  }
  
  
  
	
}
