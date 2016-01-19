package com.przepisy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.przepisy.web.dao.Przepis;
import com.przepisy.web.dao.PrzepisyDao;

@Service("przepisyService")
public class PrzepisyService {
	
	private PrzepisyDao przepisyDao;
	
	@Autowired
	public void setPrzepisyDao(PrzepisyDao przepisyDao){
		this.przepisyDao = przepisyDao;
	}
	
	
	public List<Przepis> getPrzepisy(){
		return przepisyDao.getPrzepisy();
	}


	public void createPrzepis(Przepis przepis) {
		przepisyDao.create(przepis);
		
	}
}