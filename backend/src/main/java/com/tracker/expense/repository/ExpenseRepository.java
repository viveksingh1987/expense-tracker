package com.tracker.expense.repository;

import com.tracker.expense.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends MongoRepository<Expense, Long> {

    // Custom query methods can be defined here if needed
    // For example, to find expenses by user ID or date range
    List<Expense> findByExpenseId(Long expenseId);

    List<Expense> findByUserEmail(String userEmail);

    List<Expense> findByDateBetween(LocalDate startDate, LocalDate endDate);
}
