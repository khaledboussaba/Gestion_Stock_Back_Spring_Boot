package com.project.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.project.stock.entity.Produit;
import com.project.stock.repository.ProduitRepository;

@Service
@Primary
public class ProduitServiceImpl implements IProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> getProduits() {
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produitRepository.save(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		Produit p = new Produit();
		p.setId(id);
		produitRepository.delete(p); 
	}

}
