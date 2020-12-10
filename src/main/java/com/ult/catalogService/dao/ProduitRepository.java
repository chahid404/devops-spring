package com.ult.catalogService.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ult.catalogService.entites.Produit;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	//localhost:8080/produits/search/byDesignation?mc=ordi
	@RestResource(path = "/byDesignation")
	public List<Produit> findByDesignationContains(@Param("mc") String des);
	
	
	//localhost:8080/produits/search/byDesignationPage?mc=rdi&page2&size=3
	@RestResource(path = "/byDesignationPage")
	public Page<Produit> findByDesignationContains(@Param("mc") String des,Pageable pageable);

}
