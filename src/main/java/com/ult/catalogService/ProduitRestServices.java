package com.ult.catalogService;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ult.catalogService.dao.ProduitRepository;
import com.ult.catalogService.entites.Produit;
@CrossOrigin("*")

@RestController
public class ProduitRestServices {
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping(value = "/listProduits")
	public List<Produit> listProduit(){
		return produitRepository.findAll();
	}
	
	
	@GetMapping(value = "/listProduits/{id}")
	public Produit listProduit(@PathVariable(name = "id") Long id){
		return produitRepository.findById(id).get();
	}
	
	@PutMapping(value = "/listProduits/{id}")
	public Produit updateProduit(@PathVariable(name = "id") Long id,@RequestBody Produit p){
		p.setId(id);
		return produitRepository.save(p);
	}
	
	
	@PostMapping(value = "/listProduits")
	public Produit saveProduit(@RequestBody Produit p){
		return produitRepository.save(p);
	}
	
	@DeleteMapping(value = "/listProduits/{id}")
	public void deleteProduit(@PathVariable(name = "id") Long id){
		
		produitRepository.deleteById(id);
	}
}
