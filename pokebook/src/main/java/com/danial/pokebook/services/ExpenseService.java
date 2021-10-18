package com.danial.pokebook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danial.pokebook.models.Expense;
import com.danial.pokebook.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
 
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}
 
	public Expense createExpense(Expense b) {
		return expenseRepository.save(b);
	}

	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
 
	public Expense updateExpense(Expense expense) {
			return expenseRepository.save(expense);
	}
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}

}
