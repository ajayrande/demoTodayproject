package com.cjc.serviceimpl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.model.Ajay;
import com.cjc.repository.HomeRepAjay;
import com.cjc.service.HomeAjayService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HomeServiceajayimpl implements HomeAjayService
{
	@Autowired
	HomeRepAjay aj;

	@Override
	public Ajay saveAjay(Ajay a) 
	{
		
		return aj.save(a);
	}

	@Override
	public List<Ajay> getAjay() {
		
		return aj.findAll();
	}

	@Override
	public Ajay updateAjay(Ajay a) {
		// TODO Auto-generated method stub
		return aj.save(a);
	}

	@Override
	public void deleteAjay(int aid) {
		// TODO Auto-generated method stub
		aj.deleteById(aid);
	}

	@Override
	public Ajay saveimg(String aJson, MultipartFile proofimg, MultipartFile aadhar) {
		ObjectMapper obj= new ObjectMapper();
		try {
			Ajay jj=obj.readValue(aJson, Ajay.class);
			
			jj.setProfimg(proofimg.getBytes());
			jj.setAdhar(aadhar.getBytes());
			
			return aj.save(jj);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Iterable<Ajay> getAllajay() {
		// TODO Auto-generated method stub
		return aj.findAll();
	}

	@Override
	public Ajay getSingle_ajay(int aid) {
		// TODO Auto-generated method stub
		Optional<Ajay> aju=aj.findById(aid);
		if(aju.isPresent())
		{
			return aju.get();
		}
		else
		{
			
		}
		return new Ajay();
	}

	

}
