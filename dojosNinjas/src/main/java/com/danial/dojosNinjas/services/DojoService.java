package com.danial.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danial.dojosNinjas.models.Dojo;
import com.danial.dojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	DojoRepository dojoRepo;
	
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo d) {
		return dojoRepo.save(d);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
}
