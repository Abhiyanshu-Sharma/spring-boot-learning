package com.isrdc.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "properties")
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prpertyId;
	
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "tax_payer_id_fk")
	private TaxPayer taxPayer;
	
	
	
}
