package com.cjc.service;

import com.cjc.model.Supplier;

public interface HomeServiceSup {

	Supplier saveProductDetails(Supplier s);

	Iterable<Supplier> getdata();

	Supplier getbyid(int suppid);

	Supplier update(Supplier s);

	void delete(int suppid);

}
