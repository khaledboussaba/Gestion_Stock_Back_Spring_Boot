package com.project.stock.service;

import java.util.List;

import com.project.stock.entity.Produit;

public interface IProduitService {

	List<Produit> getProduits();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(Long id);
	
}
