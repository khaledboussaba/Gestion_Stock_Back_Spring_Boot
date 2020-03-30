package com.project.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.project.stock.entity.Produit;
import com.project.stock.repository.ProduitRepository;

@Service
@Primary
public class ProduitServiceImpl implements ICrudService<Produit, Long> {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> getAll() {
		return produitRepository.findAll();
	}

	@Override
	public void add(Produit produit) {
		produitRepository.save(produit);
	}

	@Override
	public void update(Produit produit) {
		produitRepository.save(produit);
	}

	@Override
	public void delete(Long id) {
		Produit p = new Produit();
		p.setId(id);
		produitRepository.delete(p); 
	}

}
