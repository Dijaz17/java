package com.danial.dojosNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danial.dojosNinjas.models.Ninja;
import com.danial.dojosNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	NinjaRepository ninjaRepo;
	
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
	
	public Ninja createNinja(Ninja n) {
		return ninjaRepo.save(n);
	}
	
}
