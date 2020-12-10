package com.ult.catalogService.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@CrossOrigin("*")
@Entity
@Data // jpa
@NoArgsConstructor // Constructor sans parametre
@AllArgsConstructor // Constructor avec parametre
@ToString
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private double price;
	private int quantite;

}
