package com.cjc.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Product;
import com.cjc.repository.HomeRepositoryPro;
import com.cjc.service.HomeServicepro;

@Service
public class HomeServiceimpl  implements HomeServicepro
{
	@Autowired
	HomeRepositoryPro rp;

	@Override
	public Product savepro(Product p) {
		Product pp=rp.save(p);
		return pp;
	}

	@Override
	public Iterable<Product>  getall() {
		Iterable<Product> pp= rp.findAll();
		return pp;
	}

	@Override
	public Product getbyid(int id) {
		Optional<Product> p=rp.findById(id);
		if(p.isPresent())
		{
			return p.get();
		}
		else
		{
			
		}
		return null;
	}

	@Override
	public Product update(Product p) {
		Product ps= rp.save(p);
		return ps ;
	}

	@Override
	public void delete(int id) {
		rp.deleteById(id);
		
	}

}
