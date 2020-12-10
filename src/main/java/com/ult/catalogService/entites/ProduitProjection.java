package com.ult.catalogService.entites;

import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
//http://localhost:8080/produits?projection=p1
@Projection(name = "p1",types = Produit.class)
public interface ProduitProjection {
	public double getPrice();
	public String getDesignation();
	//public long getId();
 	

}
