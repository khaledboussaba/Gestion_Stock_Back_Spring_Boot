package com.project.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.stock.entity.Produit;
import com.project.stock.service.ICrudService;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

	@Autowired
	private ICrudService<Produit, Long> produitService;
	
	@GetMapping
	public List<Produit> getAll() {
		return produitService.getAll();
	}
	
	@PostMapping
	public void add(@RequestBody Produit produit) {
		produitService.add(produit);
	}
	
	@PutMapping
	public void update(@RequestBody Produit produit) {
		produitService.update(produit);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		produitService.delete(id);
	}
}
