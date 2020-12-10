package com.ult.catalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ult.catalogService.dao.ProduitRepository;
import com.ult.catalogService.entites.Produit;
@CrossOrigin("*")
@SpringBootApplication
public class TestSpringEtAngualrApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;
	
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(TestSpringEtAngualrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		
		//produitRepository.save(new Produit(null,"ordinateur 1",6700,3));
		//produitRepository.save(new Produit(null,"ordinateur 2",5700,4));
		//produitRepository.save(new Produit(null,"ordinateur 3",4700,5));
		
		produitRepository.findAll().forEach(p ->{
			System.out.println(p.toString());
		});
	}

}
