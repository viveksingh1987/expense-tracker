package com.tracker.expense.controller;

import com.tracker.expense.model.Expense;
import com.tracker.expense.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping("/{email}")
    public List<Expense> getExpenses(@PathVariable String email) {
        // Logic to retrieve expenses
       return expenseRepository.findByUserEmail(email);
    }

    @PostMapping("/add")
    public Expense addExpense(@RequestBody Expense expense) {
        // Logic to add a new expense
      return  expenseRepository.save(expense);
    }

    @PutMapping("/update/{id}")
    public void updateExpense(@PathVariable String id, @RequestBody Expense expense) {
        // Logic to update an existing expense
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteExpense(@PathVariable Long id) {
        // Logic to delete an expense
       Expense expense = (Expense) expenseRepository.findByExpenseId(id);
        if (expense != null) {
            expenseRepository.delete(expense);
            return ResponseEntity.ok().build();
        }else {
           return  ResponseEntity.notFound().build();
        }
    }

}
