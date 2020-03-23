package com.project.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		
//		ConfigurableApplicationContext ctx =
//				SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		
//		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
//		
//		produitRepository.save(new Produit("Livre", 50, 20));
//		produitRepository.save(new Produit("Cahier", 200, 5.25f));
//		produitRepository.save(new Produit("Stylo", 500, 2.10f));
				
	}

}
