package com.project.stock;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.stock.entity.Produit;
import com.project.stock.entity.Role;
import com.project.stock.entity.User;
import com.project.stock.repository.ProduitRepository;
import com.project.stock.repository.RoleRepository;
import com.project.stock.repository.UserRepository;
import com.project.stock.util.RoleEnum;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		
//		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		
		ConfigurableApplicationContext ctx =
				SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		
		produitRepository.save(new Produit("Livre", 50, 20));
		produitRepository.save(new Produit("Cahier", 200, 5.25f));
		produitRepository.save(new Produit("Stylo", 500, 2.10f));
		
		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		roleRepository.save(roleAdmin);
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		User user = new User("user", "pwd", true);
		user.setRoles(Arrays.asList(roleUser));
		userRepository.save(user);

		User admin = new User("admin", "pwd1", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		userRepository.save(admin);
				
	}

}
