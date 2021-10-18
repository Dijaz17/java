package com.danial.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.danial.dojosNinjas.models.Dojo;
import com.danial.dojosNinjas.models.Ninja;
import com.danial.dojosNinjas.services.DojoService;
import com.danial.dojosNinjas.services.NinjaService;

@Controller
public class DojosNinjasController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@RequestMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
		
		List<Dojo> allDojos = dojoService.allDojos();
		
		model.addAttribute("dojos", allDojos);
		
		return "index.jsp";
	}
	
	@RequestMapping("/createDojo")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "createDojo.jsp";
	}
	
	@RequestMapping(value="/newDojo", method=RequestMethod.POST)
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
            return "createDojo.jsp";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/";
        }
	}
	
	@RequestMapping("/createNinja")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		
		List<Dojo> allDojos = dojoService.allDojos();
		
		model.addAttribute("dojos", allDojos);
		
		return "createNinja.jsp";
	}
	
	@RequestMapping(value="/newNinja", method=RequestMethod.POST)
	public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
            return "createNinja.jsp";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/";
        }
	}
	
	@RequestMapping("/dojo/{id}")
		public String oneExpense(@PathVariable("id") Long id, @ModelAttribute("dojo") Dojo dojo, Model model) {
		
		Dojo oneDojo = dojoService.findDojo(id);
		
		model.addAttribute("dojo", oneDojo);
		
		return "oneDojo.jsp";
	}
}
