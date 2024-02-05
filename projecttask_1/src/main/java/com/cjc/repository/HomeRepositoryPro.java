package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Product;

public interface HomeRepositoryPro  extends JpaRepository<Product, Integer>
{

}
