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

import com.cjc.model.Supplier;
import com.cjc.service.HomeServiceSup;

@RestController
@RequestMapping("/supplier")
public class HomeControllerSup 
{
	@Autowired
	HomeServiceSup hs;
	
	
	@PostMapping("/savesupp")
	public ResponseEntity<Supplier> save(@RequestBody Supplier s)
	{
		Supplier sp= hs.saveProductDetails(s);
		return new ResponseEntity<Supplier>(sp, HttpStatus.CREATED);
	}
	
	@GetMapping("/getsupplier")
	public ResponseEntity<Iterable<Supplier>> getdata()
	{
		Iterable<Supplier> supp=hs.getdata();
		return new ResponseEntity<Iterable<Supplier>>(supp, HttpStatus.OK);
		
	}
	
	@GetMapping("/Supplier/{Suppid}")
	public ResponseEntity<Supplier> getbyid(@PathVariable int Suppid)
	{
		Supplier s= hs.getbyid(Suppid);
		return new ResponseEntity<Supplier>(s, HttpStatus.OK);
	}
	
	@PutMapping("/updatesupp")
	public ResponseEntity<Supplier> update(@RequestBody Supplier s)
	{
		Supplier sp= hs.update(s);
		return new ResponseEntity<Supplier>(sp, HttpStatus.CREATED);
	}
	@DeleteMapping("/deletesupp/{suppid}")
	public String delete(@PathVariable int suppid)
	{
		hs.delete(suppid);
		return "delete";
		
	}

}
