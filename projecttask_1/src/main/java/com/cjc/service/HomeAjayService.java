package com.cjc.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.model.Ajay;

public interface HomeAjayService 
{

	Ajay saveAjay(Ajay a);

	List<Ajay> getAjay();

	Ajay updateAjay(Ajay a);

	void deleteAjay(int aid);

	Ajay saveimg(String aJson, MultipartFile proofimg, MultipartFile aadhar);

	Iterable<Ajay> getAllajay();

	Ajay getSingle_ajay(int aid);

	

}
