package com.danial.pokebook.controllers;

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

import com.danial.pokebook.models.Expense;
import com.danial.pokebook.services.ExpenseService;

@Controller
public class HomeController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		
		List<Expense> allExpenses = expenseService.allExpenses();
		
		model.addAttribute("expenses", allExpenses);
		
		return "index.jsp";
	}
	
	@RequestMapping(value="/newExpense", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            expenseService.createExpense(expense);
            return "redirect:/";
        }
    }
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		
		Expense oneExpense = expenseService.findExpense(id);
		
		model.addAttribute("expense", oneExpense);
		
		return "edit.jsp";
	}
	
	@RequestMapping(value= "/editExpense/{id}", method=RequestMethod.PUT)
	public String editingExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            expenseService.updateExpense(expense);
            return "redirect:/";
        }
	}
	
	@RequestMapping(value="/deleteExpense/{id}", method=RequestMethod.DELETE)
	public String deleteExp(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
	
	@RequestMapping("/oneExp/{id}")
	public String oneExpense(@PathVariable("id") Long id, Model model) {
		
		Expense oneExpense = expenseService.findExpense(id);
		
		model.addAttribute("expense", oneExpense);
		
		return "single.jsp";
	}
	
}
