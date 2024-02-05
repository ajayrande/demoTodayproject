package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier 
{
	   @Id

	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supplier_id;
	private String supplier_name;
	private String supplier_address;
	private String supplier_email;
	private long supplier_mobno;
	
	

}
