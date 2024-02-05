package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ajay 
{
	private int aid;
	private String aname;
	private long mob;
	
	@Lob
	private byte[] profimg;
	
	@Lob
	private byte[] adhar;

}
