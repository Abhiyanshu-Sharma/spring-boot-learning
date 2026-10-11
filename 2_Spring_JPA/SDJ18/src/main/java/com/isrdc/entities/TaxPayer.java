package com.isrdc.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tax_payers")
public class TaxPayer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taxPayerId;
	
	private String name;
	
	@OneToMany(mappedBy = "taxPayer", cascade = CascadeType.ALL)
	List<Property> props;
}
