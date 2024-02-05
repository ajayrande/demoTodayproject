package com.cjc.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.model.Ajay;
import com.cjc.service.HomeAjayService;

@RestController
public class AjayHomecontroller 
{

	@Autowired
	HomeAjayService as;
	
	@PostMapping("/SaveAjay")
	
	public ResponseEntity<Ajay> saveAjay(@ModelAttribute Ajay a)
	{
		Ajay aa=as.saveAjay(a);
		return new ResponseEntity<Ajay>(aa,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAjay")
	public ResponseEntity<List<Ajay>> getAjay()
	{
		List<Ajay> l=as.getAjay();
		return new ResponseEntity<List<Ajay>>(l,HttpStatus.OK);
		
	}
	
	@PutMapping("/updateajay")
	public ResponseEntity<Ajay> updateAjay(@ModelAttribute Ajay a)
	{
		Ajay ad=as.updateAjay(a);
		return new ResponseEntity<Ajay>(ad,HttpStatus.CREATED);
	}
	@DeleteMapping("/deletAjay/{aid}")
	public ResponseEntity<String> deleteAjay(@PathVariable("aid")int aid)
	{
		as.deleteAjay(aid);
		return new ResponseEntity<String>("delete ajay",HttpStatus.OK);
	}
	
	@PostMapping("/saveallajay")
	public ResponseEntity<Ajay> saveimgajay(
			@RequestPart(name = "ajayjson",required = true )String aJson,
			@RequestPart(name="profimg",required = true) MultipartFile proofimg ,
			@RequestPart(name="adhar",required = true) MultipartFile aadhar
			)
	{
		
		Ajay ss=as.saveimg(aJson,proofimg,aadhar);
		return new ResponseEntity<Ajay>(ss,HttpStatus.CREATED);
	}
	
	@GetMapping("/getajayall")
	public ResponseEntity<Iterable<Ajay>> getAllajay()
	{
		Iterable<Ajay> it=as.getAllajay();
		
		return new ResponseEntity<Iterable<Ajay>>(it,HttpStatus.OK);
	}
	
	@PutMapping("/updateajayall")
	public ResponseEntity<Ajay> updateall(@RequestPart(name = "ajayjson",required = true )String aJson,
			@RequestPart(name="profimg",required = true) MultipartFile proofimg ,
			@RequestPart(name="adhar",required = true) MultipartFile aadhar)
	{
		Ajay uu=as.saveimg(aJson,proofimg,aadhar);
		
		return new ResponseEntity<Ajay>(uu,HttpStatus.ACCEPTED);
	}
}
