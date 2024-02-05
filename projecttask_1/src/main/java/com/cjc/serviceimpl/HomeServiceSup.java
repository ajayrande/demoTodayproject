package com.cjc.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Supplier;
import com.cjc.repository.HomeRepositorySup;

@Service
public class HomeServiceSup implements com.cjc.service.HomeServiceSup
{
	
	@Autowired
	HomeRepositorySup rs;

	@Override
	public Supplier saveProductDetails(Supplier s) {
		Supplier sp=rs.save(s);
		return sp;
	}

	@Override
	public Iterable<Supplier> getdata() {
		Iterable<Supplier> sp=rs.findAll();
		
		return sp;
	}

	@Override
	public Supplier getbyid(int suppid) {
		
		Optional<Supplier> s=rs.findById(suppid);
		if(s.isPresent())
		{
			return s.get();
		}
		else
		{
			
		}
		return null;
	}

	@Override
	public Supplier update(Supplier s) {
		Supplier sp=rs.save(s);
		return sp;
	}

	@Override
	public void delete(int suppid) {
		rs.deleteById(suppid);
		
	}

}
