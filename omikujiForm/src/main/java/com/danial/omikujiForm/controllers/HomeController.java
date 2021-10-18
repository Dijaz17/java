package com.danial.omikujiForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	
	
	@RequestMapping("/")
	public String home() {
		
		return "OmikujiForm.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String processForm(HttpSession session, @RequestParam(value="years") String years, @RequestParam(value="city") String city, @RequestParam(value="roommate") String roommate, @RequestParam(value="profession") String profession, @RequestParam(value="livingThing") String livingThing, @RequestParam(value="niceThing") String niceThing) {
		
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("roommate", roommate);
		session.setAttribute("profession", profession);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("niceThing", niceThing);
		
		return "redirect:/showOmikuji";
	}
	
	@RequestMapping("/showOmikuji")
	public String display(HttpSession session, Model model) {
		
		model.addAttribute("years", session.getAttribute("years"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("roommate", session.getAttribute("roommate"));
		model.addAttribute("profession", session.getAttribute("profession"));
		model.addAttribute("livingThing", session.getAttribute("livingThing"));
		model.addAttribute("niceThing", session.getAttribute("niceThing"));
		
		return "displayResults.jsp";
	}

}
