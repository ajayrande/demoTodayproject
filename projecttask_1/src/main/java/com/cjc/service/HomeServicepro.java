package com.cjc.service;

import com.cjc.model.Product;

public interface HomeServicepro {

	Product savepro(Product p);

	Iterable<Product> getall();

	Product getbyid(int id);

	Product update(Product p);

	void delete(int id);

}
