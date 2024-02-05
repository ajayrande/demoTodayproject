package com.cjc.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Product;
import com.cjc.service.HomeServicepro;

@RestController
@RequestMapping("/product")
public class HomeControllerpro 
{
	@Autowired
	HomeServicepro hp;
	
	
	@PostMapping("/savepord")
	public ResponseEntity<Product> savepro(@RequestBody Product p)
	{
		Product ps=hp.savepro(p);
		System.out.println(p);
		return new ResponseEntity<Product>(p, HttpStatus.CREATED);
	}
	
	@GetMapping("/getproduct")
	public ResponseEntity<Iterable<Product>> getall()
	{
		Iterable<Product> pp=hp.getall();
		return new ResponseEntity<Iterable<Product>>(pp, HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Product> getbyid(@PathVariable int id)
	{
		Product ps=hp.getbyid(id);
		return new ResponseEntity<Product>(ps, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updateproduct")
	public ResponseEntity<Product> update(@RequestBody Product p)
	{
		Product pt= hp.update(p);
		return new ResponseEntity<Product>(pt, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deletepro/{id}")
	public String delete(@PathVariable int id)
	{
		hp.delete(id);
		return "delete product";
	}

}
